import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class DefaultExample {
    public static <T, R> List<R> aplicarFuncionALaLista(List<T> lista, Function<T, R> funcion) {
        List<R> resultado = new ArrayList<>();
        for (T elemento : lista) {
            resultado.add(funcion.apply(elemento));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        // Usar una función lambda como parámetro
        List<Integer> cuadrados = aplicarFuncionALaLista(numeros, x -> x * x);

        System.out.println(cuadrados); // Output: [1, 4, 9, 16, 25]
    }
}
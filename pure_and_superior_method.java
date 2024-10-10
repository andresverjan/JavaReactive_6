import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class pure_and_superior_method {
    public static int sum(List<Integer> numbers) {
        int suma = 0;
        for (int num : numbers) {
            suma += num;
        }
        return suma;
    }
    public static <T, R> List <R> aplicarFuncionALaLista(List <T> lista, Function <T,R> funcion){
        List <R> resultado =  new ArrayList<>();
        for (T elemento: lista){
            resultado.add(funcion.apply(elemento));
        }
        return resultado;
    }

    public static void main (String [] args){
        List <Integer> numeros = List.of(1,2,3,4,5);
        List <Integer> cuadrados = aplicarFuncionALaLista (numeros, x -> x * x);
        int result = sum(numeros);
        System.out.println(cuadrados);
        System.out.println("Sum: " +  result);
    }
}

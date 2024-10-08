import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExampleFunctions {

    public static <T, R> List<R> applyFunctionToList(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<R>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squares = applyFunctionToList(numbers, x -> x * x);

        System.out.println("squares = " + squares);
    }
}

import java.util.List;

public class PureFunction {
    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = sum(numbers);
        System.out.println("result = " + result);
    }
}

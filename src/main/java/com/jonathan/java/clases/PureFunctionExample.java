package src.main.java.com.jonathan.java.clases;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PureFunctionExample {
    static Logger logger = Logger.getLogger(PureFunctionExample.class.getName());
    public static int sum(List<Integer> numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = sum(numbers);
        // Output: Sum: 15 15 } 16
        logger.log(Level.INFO, "Sum: {}",result);
    }

}

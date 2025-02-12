import java.util.Set;
import java.util.TreeSet;

public class Unique {
    public static Set<Integer> findUniqueDigits(int[] numbers) {
        Set<Integer> uniqueDigits = new TreeSet<>();
        for (int num : numbers) {
            while (num > 0) {
                uniqueDigits.add(num % 10);
                num /= 10;
            }
        }
        return uniqueDigits;
    }

    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 4444, 666};  // Example input
        Set<Integer> uniqueDigits = findUniqueDigits(numbers);
        System.out.println(uniqueDigits);
    }
}

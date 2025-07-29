import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoTeenExample {

    // Method to filter out numbers between 13 and 19 inclusive
    public static List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num < 13 || num > 19) {
                result.add(num);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noTeen(Arrays.asList(12, 13, 19, 20)));    // [12, 20]
        System.out.println("Test 2: " + noTeen(Arrays.asList(1, 14, 1)));          // [1, 1]
        System.out.println("Test 3: " + noTeen(Arrays.asList(15)));               // []
    }
}


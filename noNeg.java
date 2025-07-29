import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNegExample {

    // Method to remove negative numbers from the list
    public static List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noNeg(Arrays.asList(1, -2)));             // [1]
        System.out.println("Test 2: " + noNeg(Arrays.asList(-3, -3, 3, 3)));      // [3, 3]
        System.out.println("Test 3: " + noNeg(Arrays.asList(-1, -1, -1)));        // []
    }
}


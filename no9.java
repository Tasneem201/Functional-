import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No9Example {

    // Method to filter out numbers ending with 9
    public static List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9) {
                result.add(num);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + no9(Arrays.asList(1, 2, 19)));            // [1, 2]
        System.out.println("Test 2: " + no9(Arrays.asList(9, 19, 29, 3)));        // [3]
        System.out.println("Test 3: " + no9(Arrays.asList(1, 2, 3)));             // [1, 2, 3]
    }
}


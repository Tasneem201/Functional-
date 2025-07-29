import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two2Example {

    // Method to multiply by 2 and exclude results ending in 2
    public static List<Integer> two2(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            int doubled = num * 2;
            if (doubled % 10 != 2) {
                result.add(doubled);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + two2(Arrays.asList(1, 2, 3)));        // [4, 6]
        System.out.println("Test 2: " + two2(Arrays.asList(2, 6, 11)));       // [4]
        System.out.println("Test 3: " + two2(Arrays.asList(0)));             // [0]
    }
}


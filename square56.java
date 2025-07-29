import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square56Example {

    // Method to compute (num^2 + 10) and omit results ending in 5 or 6
    public static List<Integer> square56(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            int value = num * num + 10;
            int lastDigit = value % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                result.add(value);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + square56(Arrays.asList(3, 1, 4)));   // [19, 11]
        System.out.println("Test 2: " + square56(Arrays.asList(1)));        // [11]
        System.out.println("Test 3: " + square56(Arrays.asList(2)));        // [14]
    }
}


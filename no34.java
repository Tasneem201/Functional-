import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No34Example {

    // Method to return strings excluding those of length 3 or 4
    public static List<String> no34(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            int len = str.length();
            if (len != 3 && len != 4) {
                result.add(str);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + no34(Arrays.asList("a", "bb", "ccc")));            // [a, bb]
        System.out.println("Test 2: " + no34(Arrays.asList("a", "bb", "ccc", "dddd")));    // [a, bb]
        System.out.println("Test 3: " + no34(Arrays.asList("ccc", "dddd", "apple")));      // [apple]
    }
}


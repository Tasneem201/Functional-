import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoLongExample {

    // Method to return strings with length less than 4
    public static List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() < 4) {
                result.add(str);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noLong(Arrays.asList("this", "not", "too", "long"))); // [not, too]
        System.out.println("Test 2: " + noLong(Arrays.asList("a", "bbb", "cccc")));           // [a, bbb]
        System.out.println("Test 3: " + noLong(Arrays.asList("cccc", "cccc", "cccc")));       // []
    }
}


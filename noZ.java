import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoZExample {

    // Method to filter out strings containing 'z'
    public static List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (!str.contains("z")) {
                result.add(str);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noZ(Arrays.asList("aaa", "bbb", "aza")));          // [aaa, bbb]
        System.out.println("Test 2: " + noZ(Arrays.asList("hziz", "hzello", "hi")));       // [hi]
        System.out.println("Test 3: " + noZ(Arrays.asList("hello", "howz", "are", "youz")));// [hello, are]
    }
}


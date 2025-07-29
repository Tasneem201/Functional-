import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoYYExample {

    // Method to append 'y' and exclude results that contain "yy"
    public static List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            String withY = str + "y";
            if (!withY.contains("yy")) {
                result.add(withY);
            }
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noYY(Arrays.asList("a", "b", "c")));      // [ay, by, cy]
        System.out.println("Test 2: " + noYY(Arrays.asList("a", "b", "cy")));     // [ay, by]
        System.out.println("Test 3: " + noYY(Arrays.asList("xx", "ya", "zz")));   // [xxy, yay, zzy]
    }
}


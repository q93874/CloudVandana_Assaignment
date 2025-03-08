package composition;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();

        // Input the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        // Check if both strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        scanner.close();
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all white spaces and convert strings to char arrays
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();

        // Check if both arrays have the same length
        if (charArray1.length != charArray2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

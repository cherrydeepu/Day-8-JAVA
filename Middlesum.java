import java.util.*;

public class MiddleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");

        // Check if input is valid
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");

        // Read array elements
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter integers only.");
                return;
            }
        }

        // Print the middle element of the array
        if (n > 0) {
            System.out.println("Middle element: " + arr[n / 2]);
        } else {
            System.out.println("Array is empty!");
        }
    }
}
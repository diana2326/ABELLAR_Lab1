import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter N: ");
        // Read the input value
        int n = sc.nextInt();

        System.out.println("*");
        
        // Print the upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading asterisk
            System.out.print("*");
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Print trailing asterisk
            System.out.print("*");
            // Move to the next line
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = n - 1; i > 0; i--) {
            // Print leading asterisk
            System.out.print("*");
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Print trailing asterisk
            System.out.print("*");
            // Move to the next line
            System.out.println();
        }

        // Print the final asterisk line
        System.out.println("*");

        // Close the scanner
        sc.close();
    }
}
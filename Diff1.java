import java.util.Scanner;

public class Diff1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit integer (leading zeros allowed): ");
        String input = input.nextLine().trim();

        if (!isValidFourDigits(input)) {
            System.out.println("Invalid input. Please enter exactly 4 digits (0-9).");
            return;
        }

        String encrypted = encrypt(input);
        System.out.println("Encrypted: " + encrypted);

    private static int[] toIntArray(String s) {
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) a[i] = s.charAt(i) - '0';
        return a;
    }

    
    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}

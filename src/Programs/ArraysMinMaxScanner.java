package Programs;

import java.util.Scanner;

public class ArraysMinMaxScanner {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of arry:");
        int n = number.nextInt();
       System.out.println("Enter the elements :");
        // Read the elements of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = number.nextInt();
        }

        // Initialize max and min values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the max and min values in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print the max-min pair
        System.out.println("Max and min pair : " + max + " " + min);
        
    }
}

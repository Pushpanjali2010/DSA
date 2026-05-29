package Arrays;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: " + " ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);
    }
}

package Arrays;

import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        int[] arr = {4, 23, 5, 13, 63, 22};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the targeted sum: ");
        int target = sc.nextInt();
        boolean found=false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    System.out.println("In array " +target+ " is the sum of " + arr[i] +" and " + arr[j]);
                }
            }
        }
        if (!found) {
            System.out.println("Array does not have the numbers for targeted sum");
        }
    }
}


package Arrays;

import java.util.Scanner;

public class ArrPractice {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter length of the array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                arr[i] +=10;
            else
                arr[i] *=2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
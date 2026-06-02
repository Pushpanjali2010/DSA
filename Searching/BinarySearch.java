package Searching;
// Search an element in a sorted array return the index of element if found else return -1
import java.util.Scanner;

public class BinarySearch {


    static void main(String[] args) {
        int[] arr={1,4,12,15,23,29,35};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target) {
        int n= arr.length;
        int low=0, high= n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else low = mid +1;
        }
        return -1;
    }
}

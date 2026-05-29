package Sorting;

public class BubbleSort {
    public  static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,9,-6,8,5,4};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int swap=0;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){ //for sorting in descending order : arr[j]<arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
            print(arr);
        }
        System.out.print("Sorted Array: ");
        print(arr);
    }
}

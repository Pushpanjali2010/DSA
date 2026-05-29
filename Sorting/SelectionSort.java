package Sorting;

public class SelectionSort {
    public  static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr={8,4,1,-3,6,5};
        int n= arr.length;
        //find smallest and swap
//        for (int i = 0; i < n; i++) {
//            int min=Integer.MAX_VALUE, mindx=-1;
//            for (int j = i; j < n; j++) {
//                if(arr[j]<min){
//                    min=arr[j];
//                    mindx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[mindx];
//            arr[mindx]=temp;
//        }
//        print(arr);

        //find largest and swap
        for (int i = 0; i < n; i++) {
            int max=Integer.MIN_VALUE, maxidx=-1;
            for (int j = 0; j < n-i; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    maxidx=j;
                }
            }
            int temp=arr[n-i-1];
            arr[n-i-1]=arr[maxidx];
            arr[maxidx]=temp;
        }
        print(arr);
    }
}

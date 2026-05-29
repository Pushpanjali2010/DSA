package Arrays;

public class SecondMax {
    static void main(String[] args) {
        int[] arr={12,13,24,34,8,24,-10};
        int n= arr.length;
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int SecMax= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>SecMax && arr[i]!=max){
                SecMax=arr[i];
            }
        }
        System.out.print("Second Largest element is: " + SecMax);
    }
}

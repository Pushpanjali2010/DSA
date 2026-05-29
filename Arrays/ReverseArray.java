package Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr={12,45,32,76,23,76,45};
        int n= arr.length;
        for(int ele : arr) System.out.print(ele+" ");
        System.out.println();
        int i=0, j=n-1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}

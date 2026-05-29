package Arrays;
//Given an unsorted array of 1 to n , find missing number
public class MissingNum {
    static void main(String[] args) {
        int[] arr={8,6,5,2,1,7,3};
        int n=arr.length+1;
        int arrsum=0;
        int sum =n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            arrsum +=arr[i];
        }
        int num = sum-arrsum;
        System.out.print(num);
    }
}

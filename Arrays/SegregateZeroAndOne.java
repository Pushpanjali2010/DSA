package Arrays;

public class SegregateZeroAndOne {
    static void main(String[] args) {
        int[] arr={0,1,0,0,1,0};
        ZeroAndOne(arr);

    }
    static void ZeroAndOne(int[] arr){
//        int numOfZeros=0;
//        int numOfOnce=0;
//        for(int ele : arr)
//            if(ele==0) numOfZeros++;
//            else numOfOnce++;
//        for(int i=0; i<numOfZeros; i++) arr[i]=0;
//        for(int i=numOfZeros; i<arr.length; i++) arr[i]=1;
//        for(int ele : arr) System.out.print(ele + " ");

        //Method 2
        int n=arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else if (arr[i]==1 && arr[j]==0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for (int ele : arr) System.out.print(ele + " ");
    }
}


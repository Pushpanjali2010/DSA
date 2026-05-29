package Arrays;

public class PrintNegative {
    static void main(String[] args) {
        int[] arr={23,-5,10,-3,67,34,-56};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}

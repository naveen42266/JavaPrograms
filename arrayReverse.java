import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("Array Reverse order");
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

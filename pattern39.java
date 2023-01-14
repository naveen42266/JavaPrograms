/*
2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 
*/
import java.util.Scanner;

public class pattern39 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); 
int rows = in.nextInt(); 
int a=0;
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
         if(j%2==0){
             a+=2;
       System.out.print(a + " ");
         }
         else if(j%2!=0){
             a+=2;
       System.out.print(a+" ");
         }
     }
  System.out.println();
}
}
}

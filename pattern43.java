/*
3 
3 4 
4 5 5 
5 6 6 7 
7 8 8 9 9 
*/
import java.util.Scanner;

public class pattern43 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); 
int rows = in.nextInt(); 
int a=3;
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
         if(j%2==0){
             a+=1;
       System.out.print(a + " ");
         }
         else if(j%2!=0){
             a+=0;
       System.out.print(a+" ");
         }
     }
  System.out.println();
}
}
}

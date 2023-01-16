/*
0 
0 1 
1 2 2 
2 3 3 4 
4 5 5 6 6 
*/
import java.util.Scanner;

public class pattern41 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); 
int rows = in.nextInt(); 
int a=0;
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

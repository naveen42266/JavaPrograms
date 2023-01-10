/*
1 
1 2 
1 2 1 
1 2 1 2 
1 2 1 2 1 
*/
import java.util.Scanner;

public class pattern35 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); 
int rows = in.nextInt(); 
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
         if(j%2==0)
       System.out.print((2) + " "); 
         else if(j%2!=0)
       System.out.print((1)+" ");
     }
  System.out.println();
}
}
}

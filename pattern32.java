/*
6 
7 6 
6 5 4 
7 6 5 4 
6 5 4 3 2    
*/
import java.util.Scanner;

public class pattern32 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); //Input
int rows = in.nextInt(); 
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
         if(i%2==0)
       System.out.print((j+2) + " "); //Print j+10 value and space
         else if(i%2!=0)
       System.out.print((j+1)+" ");
     }
  System.out.println();
}
}
}

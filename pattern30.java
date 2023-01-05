/*
10 
10 9 
10 9 8 
10 9 8 7 
10 9 8 7 6  
*/
import java.util.Scanner;

public class pattern30 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); //Input
int rows = in.nextInt(); 
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
       System.out.print((j+5) + " "); //Print j+5 value and space
     }
  System.out.println();
}
}
}

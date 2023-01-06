/*
15 
15 14 
15 14 13 
15 14 13 12 
15 14 13 12 11   
*/
import java.util.Scanner;

public class pattern31 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); //Input
int rows = in.nextInt(); 
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
       System.out.print((j+10) + " "); //Print j+10 value and space
     }
  System.out.println();
}
}
}

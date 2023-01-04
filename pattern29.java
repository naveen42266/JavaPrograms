/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/
import java.util.Scanner;

public class pattern29 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); //Input
int rows = in.nextInt(); 
for (int i = rows; i >= 1; i--) {
     for (int j = rows; j >= i; j--) {
       System.out.print(j + " "); //Print j value and space
     }
  System.out.println();
}
}
}

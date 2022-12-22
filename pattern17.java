import java.util.Scanner;

public class pattern17 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); //Input
int rows = in.nextInt(); 
for (int i = 1; i <= rows; i++) {
     for (int j = 1; j <= i; j++) {
       System.out.print(j + " "); //Print j value and space
     }
  System.out.println();
}
}
}

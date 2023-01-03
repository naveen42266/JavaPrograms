/*
0 
  1 
   0 
    1 
     0 
*/
import java.util.Scanner;

public class pattern28 {

public static void main(String[] args) {

int rows = 5;


for (int i = 0; i <= rows - 1; i++) { //For loop for Rows
int j=0;
for ( j = 0; j <= i; j++) { //For loop for Column

System.out.print(" "); // blank space

}
if(j%2==0){
   System.out.print(1+ " "); // prints * and blank space
}
else{
System.out.print(0+ " "); // prints * and blank space
}

System.out.println(); //Next line

}

}

}

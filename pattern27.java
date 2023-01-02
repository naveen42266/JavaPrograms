/*
 1 1 1 1 1 
  0 0 0 0 
   1 1 1 
    0 0 
     1 
*/
import java.util.Scanner;

public class pattern27 {

public static void main(String[] args) {

int rows = 5;
int a=0;

for (int i = 0; i <= rows - 1; i++) { //For loop for Rows

for (int j = 0; j <= i; j++) { //For loop for Column

System.out.print(" "); // blank space

}
if(i%2==0){
    for (int k = 0; k <= rows - 1 - i; k++) { 

    System.out.print(1+ " "); // prints * and blank space
    

}
}
else{

for (int k = 0; k <= rows - 1 - i; k++) { 

System.out.print(a+ " "); // prints * and blank space

}
}

System.out.println(); //Next line

}

}

}

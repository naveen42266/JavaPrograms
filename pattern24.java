/*
2  4  6  8  10 
 12 14 16 18 
   20 22 24 
    26 28 
     30  
*/
import java.util.Scanner;

public class pattern24 {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Enter the number of rows: ");

int rows = in.nextInt();
int a=2;

for (int i = 0; i <= rows - 1; i++) { //For loop for Rows

for (int j = 0; j <= i; j++) { //For loop for Column

System.out.print(" "); // blank space

}
if(i==0){
    for (int k = 0; k <= rows - 1 - i; k++) { 

System.out.print(a+ "  "); // prints * and blank space
a+=2;

}
}
else{

for (int k = 0; k <= rows - 1 - i; k++) { 

System.out.print(a+ " "); // prints * and blank space
a+=2;
}
}

System.out.println(); //Next line

}

in.close();

}

}

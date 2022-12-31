/*
1  3  5  7  9  
  11 13 15 17 
   19 21 23 
    25 27 
     29 

*/
import java.util.Scanner;

public class pattern25 {

public static void main(String[] args) {

int rows = 5;
int a=1;

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



}

}

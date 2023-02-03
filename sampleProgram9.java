/*
sample input :3
1 2 8
4 100 1
7 3 5
sample output : 
ALICE
CHARLIE
BOB
*/
import java.util.Scanner;

public class sampleProgram9{

public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(a < b && a < c)
		    System.out.println("ALICE");
		    else if(b < a && b < c)
		    System.out.println("BOB");
		    else if(c < a && b > c)
		    System.out.println("CHARLIE");
		   
		}
}
}

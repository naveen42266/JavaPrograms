/*
sample input :4
97
42
80
10
sample output : 
YES
NO
YES
NO
*/
import java.util.Scanner;

public class sampleProgram13{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    if(a>=80){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
}
}

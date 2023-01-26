/*
sample input : 3
100 200 10
111 199 11
190 200 10
sample output : 
10
8
1
*/
import java.util.Scanner;

public class sampleProgram {

public static void main(String[] args) {

Scanner in = new Scanner(System.in); 
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=b-a;
		    System.out.println(d/c);
}
}
}

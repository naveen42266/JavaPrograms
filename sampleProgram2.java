/*
sample input : 4
4 2
8 7
5 1
2 1
sample output : 
2
1
4
1
*/
import java.util.Scanner;

public class sampleProgram2 {

public static void main(String[] args) {

Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    System.out.println(a-b);
		}
}
}

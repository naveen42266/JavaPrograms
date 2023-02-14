/*
sample input :2
2 15
0 15
sample output : 
30
0
*/
import java.util.Scanner;

public class sampleProgram17{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    System.out.println(a*b);
		}
}
}

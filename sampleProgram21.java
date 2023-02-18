/*
sample input :3
2 3 4
1 5 2
8 8 8
sample output : 
6
5
16
*/
import java.util.Scanner;

public class sampleProgram21{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(a+c >=b)
		    System.out.println(a+c);
		    else
		    System.out.println(b);
		}
}
}

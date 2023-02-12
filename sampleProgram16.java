/*
sample input :2
1 2 4
2 2 3
sample output : 
YES
NO
*/
import java.util.Scanner;

public class sampleProgram16{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(a+b<=c)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
}
}

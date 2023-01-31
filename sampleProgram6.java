/*
sample input :3
2 10 3
2 10 4
1 5 10
sample output : 
NO
YES
YES
*/
import java.util.Scanner;

public class sampleProgram6{

public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if((a+1)*c>=b)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
}
}

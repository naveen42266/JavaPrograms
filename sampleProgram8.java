/*
sample input :4
5 2 3
10 3 3
7 7 1
3 2 1
sample output : 
YES
NO
YES
NO
*/
import java.util.Scanner;

public class sampleProgram8{

public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	      int n=in.nextInt();
		    for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(b*c>=a)
		    System.out.println("YES")
		    else 
		    System.out.println("NO");
		}
}
}

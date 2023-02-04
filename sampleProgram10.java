/*
sample input :4
1 2 3
1 1 1
2 2 2
2 1 1
sample output : 
YES
NO
YES
NO
*/
import java.util.Scanner;

public class sampleProgram10{

public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(a+b+c > 5)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
}
}

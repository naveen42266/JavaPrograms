/*
sample input :4
2 15 10
1 10 1
5 60 100
1 11 7
sample output : 
150
10
5000
70
*/
import java.util.Scanner;

public class sampleProgram20{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int totalseats=10*a;
		    int totalprice=b*c;
		    if(totalseats>=b)
		    {
		        System.out.println(totalprice);
		    }
		    else
		    {
		        System.out.println(10*c*a);
		    }
		}
}
}

/*
sample input :4
100 10
200 5
500 10
100 7
sample output : 
20
25
60
17
*/
import java.util.Scanner;

public class sampleProgram3 {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=a-b;
		    int d=a/10;
		    System.out.println((a+d)-c);
		}
}
}

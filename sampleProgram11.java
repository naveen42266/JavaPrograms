/*
sample input :2
A B C
A B
B C A
A C
sample output : 
A
C
*/
import java.util.Scanner;

public class sampleProgram11{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    char a=in.next().charAt(0);
		    char b=in.next().charAt(0);
		    char c=in.next().charAt(0);
		    char d=in.next().charAt(0);
		    char e=in.next().charAt(0);
		     if(a==d || a==e){
		         System.out.println(a);
		     }else if(b==d || b==e){
		         System.out.println(b);
		     }else{
		         System.out.println(c);
		     }
		}
}
}

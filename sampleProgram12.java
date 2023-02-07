/*
sample input :
3
1 3 2 1 2
1 5 2 1 2
1 5 3 2 2
sample output : 
Kefa
Chef
Draw
*/
import java.util.Scanner;

public class sampleProgram12{

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

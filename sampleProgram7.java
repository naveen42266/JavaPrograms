/*
sample input :4
2
3
4
9
sample output : 
3
3
6
12
*/
import java.util.Scanner;

public class sampleProgram7{

public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();

		    int b = (a-1)*3 ;
		    int c;
		    if(a%2==0){
		     c = (a-2)*3/2;
		    }
		    else{
		    c = (a-1)*3/2;
		    }
		    System.out.println(b-c);
		
		}
}
}

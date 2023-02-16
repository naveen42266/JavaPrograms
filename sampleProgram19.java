/*
sample input :4
2 3
4 1
1 1
3 5
sample output : 
YES
NO
NO
YES
*/
import java.util.Scanner;

public class sampleProgram19{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if(b>a){
		    System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
}
}

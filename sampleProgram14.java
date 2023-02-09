/*
sample input :4
1 1 1 3
2 3 1 5
4 2 3 4
2 1 4 7
sample output : 
NO
YES
YES
NO
*/
import java.util.Scanner;

public class sampleProgram14{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    if (a+b >= d){
		        
		        System.out.println("YES");
		    }
		    else if (a+c >= d){
		        
		        System.out.println("YES");
		    }
		    else if (b+c >= d){
		        
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
}
}

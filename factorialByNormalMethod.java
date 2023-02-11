import java.util.Scanner;

public class factorialByNormalMethod{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
     int fact=1;
		for(int i=0;i<n;i++){
		    fact=fact * i;
		 	}
		 	System.out.println("Factorial of"+ n +"is "+fact);


		}
}
}

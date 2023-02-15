/*
sample input :2
2019
2018
sample output : 
HOSTED
NOT HOSTED
*/
import java.util.Scanner;

public class sampleProgram18{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    String str=in.next();
		    if(str.equals("2019") || str.equals("2017") || str.equals("2016") || str.equals("2015") || str.equals("2010"))
		    System.out.println("HOSTED");
		    else
		    System.out.println("NOT HOSTED");
		}
}
}

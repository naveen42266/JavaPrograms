/*
sample input :5
1 1 1 300 2 2 2
3 2 2 6 2 2 2
2 3 2 6 2 2 2
2 2 3 6 2 2 2
100 100 100 300 100 100 100
sample output : 
NO
NO
NO
NO
YES
*/
import java.util.Scanner;

public class sampleProgram22{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int Amin = in.nextInt();
		    int Bmin = in.nextInt();
		    int Cmin = in.nextInt();
		    int Tmin =in.nextInt();
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    if(Amin<=a && Bmin<=b && Cmin<=c && a+b+c>=Tmin){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
}
}

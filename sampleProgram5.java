/*
sample input :3
1
3
6
sample output : 
East
West
South
*/
import java.util.Scanner;

public class sampleProgram5 {

public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		    int b=a%4;
		    
		    
		    if(b==1){
		        System.out.println("East");
		    }
		    else if(b==2){
		        System.out.println("South");
		    }
		    else if(b==3 ){
		        System.out.println("West");
		    }
		    else if(b==0) {
		        System.out.println("North");
		    
		    }
		}
}
}

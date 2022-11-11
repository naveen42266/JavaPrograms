import java.util.*;
class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	if(n%4==0){
	    if(n%100==0){
	        if(n%400==0)
	            System.out.println("Yes leap year");
	        else
	            System.out.println("Not a leap year");
	    }   
	    else
	        System.out.println("Yes leap year");
	} 
	
	else
	    System.out.println("Not a leap year");
	
	}
}



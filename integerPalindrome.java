import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int rem=0;
	    int total=0;
	    int temp=n;
	    while(n!=0){
	        rem=n%10;
	        total =total*10+rem;
	        n=n/10;
	    }
	    
	    if(temp==total)
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
	}
}

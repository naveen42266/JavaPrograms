import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String a=in.nextLine();
	    int len=a.length();
	    String b="";
	    for(int i=len-1;i>=0;i--){
	        b=b+a.charAt(i);
	    }
	    if(a.equalsIgnoreCase(b)){  // here this method will ignore the cases(small or caps).It checks string is equal or not 
	        	System.out.println("Palindome");
	    }
	    else{
		System.out.println("Not a Palindome");
	    }
	}
}

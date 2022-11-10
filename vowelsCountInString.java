import java.util.*;
 class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
	            count++; //if element is vowel ,count is added by 1
	       }
	       
	    }
		System.out.println(count);
	}
}

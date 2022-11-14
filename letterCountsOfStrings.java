import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	    String str=in.nextLine();
	    String str1=str.replaceAll(" ","");
	    int i=0;
	    for(char c:str1.toCharArray()){
	        i++;
	    }
		System.out.println("Count is "+i);
	}
}

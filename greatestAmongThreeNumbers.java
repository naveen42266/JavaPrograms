import java.util.*;
class Main
{  
public static void main(String[] args)   
{  
Scanner in=new Scanner(System.in);
int a=in.nextInt(), b=in.nextInt(), c=in.nextInt();  
if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");  
else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else  
System.out.println(c+" is the largest number");  
}  
}  

import java.util.*;
public class factorialByUsingRecursion{
  
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int Fact=fact(n);
        System.out.println(Fact);
    }
    static int fact(int n1){
        int out;
        if(n1==1){
            return 1;

        }
        out=fact(n1-1)*n1;
        return out;

    }
}

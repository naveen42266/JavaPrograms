/* OUTPUT :

1 
2 4 
1 1 1 
6 8 10 12 
1 1 1 1 1 

*/
public class pattern11 {
  public static void main(String []args){
     int n=5,a=0,b=0;
     for(int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(i%2==0){
                a+=2;
                System.out.print(a+" ");
                }
                else{
                    b=1;
                System.out.print(b+" ");
 
                }
            }
            System.out.println();
        }
}
}

/*   OUTPUT :

2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 

*/
public class pattern10 {
  public static void main(String []args){
     int n=5,a=0;
     for(int i=0;i<=n;i++){
            for (int j=1;j<=i;j++){
                a+=2;
                System.out.print(a+" ");
            }
            System.out.println();
        }
}
}
    
  

/* OUTPUT :
0 0 0 0 0 
1 2 3 4 
0 0 0 
5 6 
0 
*/
public class pattern14 {
  public static void main(String []args){
     int n=5,a=0,b=0;
     for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(i%2==0){
                System.out.print(a+" ");
                }
                else{
                    b+=1;
                System.out.print(b+" ");

                }
            }
            System.out.println();
        }
}
}

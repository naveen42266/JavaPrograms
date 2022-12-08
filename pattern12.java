/* OUTPUT :
2 4 6 8 10 
1 1 1 1 
12 14 16 
1 1 
18  
*/
public class pattern12 {
  public static void main(String []args){
     int n=5,a=0,b=0;
     for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
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

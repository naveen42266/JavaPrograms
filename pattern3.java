//output :
//     1 
//     2 6 
//     3 7 11 
//     4 8 12 16 
//     5 9 13 17 21 


public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int sum=i;
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum=sum+4;
            }
            System.out.println();
        }
    }

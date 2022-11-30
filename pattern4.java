// OUTPUT :
// 11 
// 22 33 
// 44 55 66 
// 77 88 99 110 
// 121 132 143 154 165 



public class pattern4 {
    public static void main(String[] args) {
        int n=5,count=0;

        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                count=count+11;
                System.out.print(count+" ");
            }System.out.println();
        }

    }
}

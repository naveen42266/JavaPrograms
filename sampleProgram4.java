/*
sample input :3
2
11
4
0101
5
00100
sample output : 
1
0
2
*/
import java.util.Scanner;

public class sampleProgram4 {

public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		for (int i=0;i<n;i++){
		    int count=0;
            int a=in.nextInt();
            String b=in.next();
            for(int j=0;j<a-1;j++){
                if(b.charAt(j)==b.charAt(j+1)){
                    count++;
                }
            }
            System.out.println(count);
        }
}
}

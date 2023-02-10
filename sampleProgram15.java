/*
sample input :4
3
1 2 3
4
5 5 5 5
4
2 2 1 1
3
1 1 2
sample output : 
2
0
2
1
*/
import java.util.Scanner;

public class sampleProgram15{

public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
		    int a=in.nextInt();
		 	int arr[]=new int [a];
		 	int arr2[]=new int[1001];
		 	for(int j=0;j<a;j++){
		 	arr[j]=in.nextInt();
            arr2[arr[j]]++;
		 	}
		 	Arrays.sort(arr2);
		 	System.out.println(a-arr2[1000]);

		    
		}
}
}

import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt(); //defining length of array 
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++) //getting array elements one by one
	    arr[i]=in.nextInt();
	    int largest=arr[0];
	    int smallest=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(smallest>arr[i]) //if smallest num is greater than arr[i] element 
	        smallest=arr[i];  // assign arr[i] to smallest
	        if(largest<arr[i]) //if largest num is lesser than arr[i] element
	        largest=arr[i]; // assign arr[i] to largest
	    }
		System.out.println("The Smallest Number is : "+smallest);
		System.out.println();
		System.out.println("The Largest Number is : "+largest);
	}
}


import java.util.*;
class Main
 {
static void sort(int arr[], int n)
 {
  int i,j;
  for (i = 0; i < n-1; i++)
  {
  for (j = 0; j < n-i-1; j++)
  {
    if (arr[j] > arr[j+1])
     {
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
     }
   }
 }
}

static int arrays_equal(int arr1[], int arr2[], int n, int m)
 {
   sort(arr1,n);
   sort(arr2,m);
   int i, count = 0;
   for(i = 0; i < n; i++)
     {
     if(arr1[i] == arr2[i])
       {
       count++;
        }
}
return count;
}

public static void main(String[] args)
{
int n,m, count = 0;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
m = sc.nextInt();
int[]arr1 = new int[n];
int[]arr2 = new int[n ;
for(int i = 0; i < n; i++)
{
arr1[i] = sc.nextInt();
}
for(int i = 0; i < m; i++)
{
arr2[i] = sc.nextInt();
}

if(arrays_equal(arr1, arr2, n, m) != n)
{
System.out.print("Not same");
}
else
System.out.print("Same");

}
}

public class removeDuplicatesInArray {

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,5,6,6,7,8,9,3,6};
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int leng= arr.length;

        for(int i=0;i< leng-1;i++){
            for (int j=i+1;j<leng-1;j++){
                if(arr[i]==arr[j]){
                    arr[j]=arr[leng-1];
                    leng--;
                }
            }
            //System.out.print(arr[i]+" ");

        }
        //Arrays.sort(arr);
        for(int i=0;i<leng;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

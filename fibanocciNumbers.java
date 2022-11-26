
public class fibanocciNumbers {
    public static void main(String[] args) {
        int a=0,b=1,temp=0,target=10;
        System.out.print(a+" "+b); // it will print '0' and '1'
        for(int i=2;i<target;i++){ //in this loop will print remainings numbers upto target 
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp); 
        }
    }
}

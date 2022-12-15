
public class reverseNoUsingRecursion {
    public static void reverseNo(int number){
        if(number>10){
            System.out.println("The number is :"+number);

        }
        else {
            System.out.println(number%10);
            reverseNo(number/10);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The reverse of the given number is + ");
        reverseNo(num);
    }


}

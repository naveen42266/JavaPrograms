import java.util.Scanner;

class addTheNumberInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int a=1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                a+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(a);
    }
}

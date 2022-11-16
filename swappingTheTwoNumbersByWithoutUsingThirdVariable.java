// Swapping of 2 numbers by without using 3rd variable

class Main {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        // method 1 
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        // method 2
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
    }
}

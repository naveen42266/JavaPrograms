public class stringProblem {
    public static void main(String[] args) {
        String str="naveen";
        String str2="naveen";
        char c1=str.charAt(str.length()-1); // picking up the LAST element from the string 1
        char c2=str2.charAt(0); // picking up the FIRST element from the string 2
        System.out.println(c1+" "+c2); 
        if(str2.charAt(0)==str.charAt(str.length()-1)){  //if both are same print 'same' otherwise goes to else part
            System.out.println("same");
        }else{
            System.out.println("no");
        }

    }
}

// sample input 
// Original string : naveen single
// sample output
// Reversed string : neevan elgnis

import java.util.Scanner;

public class wordAndLetterReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
        String originalStr = scanner.nextLine();
        String words[]=originalStr.split("\\s");
        String reversedString="";
        for(int i=0;i< words.length;i++){
            String word=words[i];
            String reversedWord=" ";
            for (int j= word.length()-1;j>=0;j--){
                reversedWord=reversedWord+word.charAt(j);

            }
            reversedString=reversedString+reversedWord+"";
        }
        System.out.println("Reversed string :"+ reversedString);
    }
}

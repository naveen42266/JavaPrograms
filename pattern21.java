/*
0 
2 4 
6 8 10 
12 14 16 18 
20 22 24 26 28 
*/

public class pattern21 {

public static void main(String[] args) {

int k = 0;

for (int i = 1; i <= 5; i++) {

for (int j = 1; j < i + 1; j++) {

System.out.print(k + " ");
k+=2;

}

System.out.println();

}

}

}

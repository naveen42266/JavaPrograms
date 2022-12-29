/*
1 
11 21 
31 41 51 
61 71 81 91 
101 111 121 131 141 
*/

public class pattern23 {

public static void main(String[] args) {

int k = 1;

for (int i = 1; i <= 5; i++) {

for (int j = 1; j < i + 1; j++) {

System.out.print(k + " ");
k+=10;

}

System.out.println();

}

}

}

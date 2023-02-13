import java.util.*;
public class primeInGivenRange{  
 public static void main(String args[]){ 
     Scanner in=new Scanner(System.in);
     int from=in.nextInt();
     int to=in.nextInt();
     for(int i=from;i<to;i++){
        int m=0,flag=0;    
        m=i/2;    
        if(i==0||i==1){
        flag=1;    
        }else{
          for(int j=2;j<=m;j++){    
            if(i%j==0){    
            flag=1;    
             }    
            }    
        if(flag==0)  {
            System.out.print(i+" "); 
            
        }
  }
         
}
}  
} 

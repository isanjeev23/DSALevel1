import java.util.*;

public class PrimeFactors{

public static void main(String[] args) {
  // write your code here
     Scanner scn = new Scanner(System.in);
      int  n = scn.nextInt();
      scn.close();

      int div = 2;

      while(div * div <= n){
        while(n%div==0){
          System.out.print(div + " ");
           n = n/div;
        }
         
        
        div++;
        
      }  
      if(n!=1){
        System.out.print(n);
      }
 }
}
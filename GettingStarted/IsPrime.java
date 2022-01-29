import java.util.*;
  
  public class IsPrime{

    public static void checkPrime(int n ){
      int div = 2; 

          while(div*div<=n){

            if(n % div ==0){

              System.out.println("not prime");

              return ;
            }

        div++;
      }

      System.out.println("prime");

      return ;
    }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here

       int t = scn.nextInt();

       for(int i=0 ; i<t ; i++){
         int n = scn.nextInt();

          checkPrime(n);
       }
       scn.close();
  
   }
  }
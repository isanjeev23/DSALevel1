import java.util.*;
  
  public class ReverseNum{
  
  public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
          int  n  = scn.nextInt();
          scn.close();
          
          

          while(n !=0){
            int rem = n % 10;
            n/=10;
           System.out.println(rem);
          }

          
          
   }
  }
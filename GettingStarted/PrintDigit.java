import java.util.*;
  
  public class PrintDigit{
  
  public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
          int  n  = scn.nextInt();
          scn.close();

          int temp= n;
          
          int count= 0;

          while(n !=0){
            n/=10;
            count++;
          }

          int div = (int)Math.pow(10,count -1 );



          while(div>0){
            int q = temp /  div ;
             temp = temp % div;

             div = div / 10;
             System.out.println(q);
          }
          
   }
  }

import java.util.*;
    
    public class Gcd{
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n1 = scn.nextInt();

       int n2 = scn.nextInt();
          scn.close();

       int temp1 = n1;

       int temp2 = n2;

            while(temp1 % temp2 !=0){
              int rem = temp1 % temp2 ;
                  temp1=temp2;
                  temp2 = rem;

            }
      // tha last divisor which completly divide is gcd
      // since int rem is a block scode this value is assigned to temp2
       // hance temp2 is gcd 

              int lcm = (n1*n2 )/temp2;

              
              System.out.println(temp2);
              System.out.println(lcm);

       }

     }
    
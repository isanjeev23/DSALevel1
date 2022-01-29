import java.util.*;
  
  public class Triplet{
  
  public static void main(String[] args) {
    // write your code here 
       Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b = scn.nextInt();
         int c = scn.nextInt();
          scn.close();
          int max = a ;

          if(max<=b){
            max = b ;

          }
          if(max <= c){
            max = c ;
          }


          if(max==a){
            System.out.println(max*max==b*b + c*c);

          }else if(max==b){
            System.out.println(max*max==a*a+ c*c);
            
          }else if(max==c){
            System.out.println(max*max==b*b + a*a);
            
          }
          else{
            System.out.println("false");
          }
   }
  }
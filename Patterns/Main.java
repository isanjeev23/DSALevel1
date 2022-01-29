import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
       scn.close();
      
          int k = 0 ;

      for(int i=1 ; i<=n; i++){

          int val = n*k +1 ;
          for(int j=1 ; j<=n ; j++){
             
             if(i==1 || i==n || j==1 || j==n){
                 System.out.print(val + " ");
             }else
              System.out.print("*" + " ");

              val++;
          }
            
            System.out.println();
            
        if(n%2==0){

          if(i<n/2){
              k+=2;
          }else if(i==n/2){
              k=k+1;
          }
          else{
              k-=2;
          }


        }

         else{
             if(i<=n/2){
                 k=k+2;
             }
             else if(i==n/2+1){
                 k= k-1;
             }else
               {
                   k=k-2;
               }
         }

      }
 }

}
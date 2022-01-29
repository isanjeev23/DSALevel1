package Pattern;
import java.util.*;
public class RadialPattern{
    public static void main(String[] args) throws Exception {
    
       
        Scanner scn  = new Scanner(System.in);
           int n  = scn.nextInt();
           scn.close();
 
 
           int N = 2*n-1 ;
 
           for(int i =0 ; i<N ; i++){
 
               for(int j=0 ; j<N ; j++){
 
                   int minDistance = Math.min(Math.min(i , j ) , Math.min(N-i-1 , N-j-1));
                   
                   int val = n - minDistance;
 
                   if(val%2==0)
                   System.out.print(val + " ");
                   else
                   System.out.print("# ");
               }
               System.out.println();
           }
 
 
 
  }
 
}
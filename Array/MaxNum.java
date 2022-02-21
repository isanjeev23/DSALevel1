
import java.util.Scanner;

public class MaxNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();

        int max = maxnumber( n , k );

        System.out.println(max);
    }

    public static int maxnumber(int n , int k){
        
         
        // Generate the largest number
        // after removal of the least
        // K digits one by one
        for(int j = 1 ; j<=k ; j++){

            int ans = 0 ;
            int i = 1 ;
            
            // Remove the least digit
            // after every iteration
            while(n/i > 0){
                // Store the numbers formed after
                // removing every digit once
                int temp = (n / (10 * i ))*i + n%i ;

                i=i*10 ;
             
                ans = Math.max(ans ,temp);

            }

            n= ans ;

        }

        return n ;
    }
}
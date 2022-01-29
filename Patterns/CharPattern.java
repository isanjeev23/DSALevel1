import java.util.Scanner;

public class CharPattern{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner  scn = new Scanner(System.in);
           int n = scn.nextInt();
           scn.close();

           int val = 65 ;

           for(int i=1 ;i<=n ; i++){
               for(int j=1 ; j<=i ; j++){

                 if(j==1 || j==i){
                     System.out.print((char)val);
                 }else
                 System.out.print("*");


               }

               System.out.println();

               val++;
           }
 }

}
import java.util.*;


public class PrintPrime{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
          int start =  scn.nextInt();
          int end  = scn.nextInt();
             scn.close();

          for(int i = start ; i<=end ; i++){
              
              boolean flag = true;

              for(int div=2 ; div*div<=i ; div++){

                  if(i % div == 0){
                      flag=false;
                      break;
                  }
              }

              if(flag==true){
                  System.out.println(i);
              }
          }
    }
}
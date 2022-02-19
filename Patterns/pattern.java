import java.util.Scanner;

class pattern{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int str = 1; 

        for(int i = 1 ; i<=n*2+1 ; i++){
            int val = 1; 
        
              
          for(int j = 1; j<=str ; j++ ){
              if(j==1 || j==str){
                  System.out.print("* ");
              }
              else{
                  System.out.print(val + " ");
                  if(j<=str/2){
                      val++;
                  }
                  else
                  val--;
              
                }
            }
           
            if(i<=n){
                str+=2;
            }
            else str-=2;

            System.out.println();
            
        }
    }
}
import java.util.Scanner;


public class PrintZigZag{

    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            print(n);
        }

    }

    public static void print(int n ) {

        if(n==0){
            return ;

        }

        System.out.print(n);

        print(n-1);

        System.out.print(n) ;

        print(n-1);

        System.out.print(n);
        


        
    }

}
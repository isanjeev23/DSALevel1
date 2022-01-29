import java.util.Scanner;

public class GradingSystem{

    public static void Display(int marks){

        if(marks>90){
            System.out.println("excellent");
        }
        else if(marks >80){
            // no need to write marks <=90 becasue upper codition already
            // handle it  , upar wala fail hua matlab no 90 s to chota h
            System.out.println("good");
        }
        else if(marks > 70){
            System.out.println("fair");
        }
        else if(marks > 60){
            System.out.println("meets expectations");
        }
        else{
            System.out.println("below par");
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
          scn.close();

        Display(marks);


    }
}
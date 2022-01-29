import java.util.*;

public class SecondMinMax {

  public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt();

     int[] arr = new int[n];

     for(int i = 0 ; i<n ; i++){
       arr[i] = scn.nextInt();

     }

     int min = Integer.MAX_VALUE ;
     int secondmin = Integer.MAX_VALUE ;

     int max = Integer.MIN_VALUE ;
     int scndmax = Integer.MIN_VALUE;

     for(int i = 0 ; i<n ; i++){

       if(arr[i] < min ){
          secondmin = min ; 
          min = arr[i];
       }
       if(arr[i]< secondmin && arr[i] > min ){
         secondmin = arr[i];

       }
        if (arr[i] > max ){
          scndmax = max ; 
          max = arr[i];
       }
        if(arr[i] > scndmax && arr[i] < max ){
         scndmax = arr[i];

       }
     }

     scn.close();
     


     System.out.print(scndmax +" " + secondmin);

  }
}

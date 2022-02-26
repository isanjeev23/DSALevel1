import java.util.Scanner ;
public class SumOfArray {
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in) ;

       int n1 = scn.nextInt();

       int[] arr1 = new int[n1];

       for(int i = 0 ; i<n1 ; i++){
            arr1[i]=scn.nextInt();
       }

       System.out.println();

       int n2 = scn.nextInt();
       int[] arr2 = new int[n2] ;

       for(int i = 0 ; i<n2 ; i++){
        arr2[i]=scn.nextInt();
      }

      System.out.println();

      scn.close();
      
      int[] arr3 = getSum(arr1 , arr2 , n1 , n2 );

      int idx = 0;
      while(arr3[idx]==0){
        idx++;
      }

      for(int i = idx ; i<arr3.length ; i++){
        System.out.println(arr3[i]);
      }


    }

    public static int[] getSum(int[] arr1 , int[] arr2 , int n1 , int n2){
      int[] sum = new int[(n1>n2)?n1+1 : n2+1];
      
      int i= n1 - 1 ;
      int j= n2 - 1 ;

      int k = sum.length-1 ;
      
      int c= 0 ;
      while(i>=0 || j>=0 || c > 0){
        int d = c ;

        if(i>=0){
          d +=arr1[i];
        }

        if(j>=0){
          d+=arr2[j];
        }

        c = d /10;
        d= d % 10 ;

        sum[k] = d ;

        i--;
        j--;
        k--;

      }
       
      return sum ;
    }
}

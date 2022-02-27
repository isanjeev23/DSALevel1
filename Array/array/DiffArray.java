import java.util.*;
public class DiffArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
  
        int[] arr1 = new int[n1];
  
        for( int i=0 ; i<n1  ; i++ ) {
            arr1[i] = scn.nextInt();
        }
  
         int n2 = scn.nextInt();
  
         int[] arr2 = new int[n2];
  
        for( int i=0 ; i<n2  ; i++) {
            arr2[i] = scn.nextInt();
        }
        scn.close();
  
        int[] sub = getDifference(arr1 , arr2, n1 , n2);
  
         int idx = 0 ;
         while ( sub[idx]==0 ) {
             idx++;
         }
  
         for (int i = idx; i < n2; i++) {
             System.out.println(sub[i]);
         }
  
       }
  
       public static int[] getDifference(int[] arr1 , int[] arr2 ,int n1 , int n2 ){
           int[] diff = new int[(n1>n2)?n1 : n2] ;
  
           int i = n1-1 ;
           int j= n2-1 ;
           int k=diff.length -1 ;
            
            int c = 0 ;
           while ( j>=0 ) {
               int d = arr2[j] -c ;
            
               if(i>=0){
                   d -= arr1[i];
               }
  
               if(d<0){
                   c = 1 ;
                   d = d + 10 ;
               }
               else 
                c = 0 ;
  
                diff[k] = d ;
  
                i--;
                j--;
                k--;
  
           }
  
           return diff ;  
       }
    }


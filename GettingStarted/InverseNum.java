import java.util.*;
public class InverseNum{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
       scn.close();
       
  
    int idx = 1;
    int inv = 0;

    while (n !=0) {
       int ip= n % 10;
            n=n/10;
      inv+=idx*(int)Math.pow(10,ip-1);
      idx++;

  }
   System.out.println(inv);
}

}
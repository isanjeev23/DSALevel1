import java.util.*;
public class RotateNum {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    scn.close();

    int temp=n;
    
    int nod=0;
    
    while(temp!=0){
      temp/=10;
      nod++;
    }

    k=k % nod;

    if(k<0){
      k=k+nod;
    }

    int div = (int)Math.pow(10,k);
    int mult = (int)Math.pow(10,nod - k);

    int rotatedNum = (n%div)*mult + n / div ;

    System.out.println(rotatedNum);
  }
}
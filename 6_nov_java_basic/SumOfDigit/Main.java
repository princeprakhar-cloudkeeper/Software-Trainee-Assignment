import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number for which you the Sum of digit:");
        int n = sc.nextInt();
        int res =0;
        System.out.print("Sum of digit for "+n+": ");
        while(n>0){
            res +=n%10;
            n = n/10; 

        }
        System.out.print("is: "+res);
    }
}

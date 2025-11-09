import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number which you to reverse: " );
        int n = sc.nextInt();
        int res = 0;
        System.out.print("Reverse for "+n);
        while(n>0){
            res = res*10 + n%10;
            n/=10;
        }
        System.out.println(" is: "+res);
    }
}

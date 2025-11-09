import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you the factorial");
        int n = sc.nextInt();
        int res =1;
        for(int  i=1;i<=n;i++){
            res *= i;
        }
        System.out.println("Factorial of the "+n+": "+res);
    }
}

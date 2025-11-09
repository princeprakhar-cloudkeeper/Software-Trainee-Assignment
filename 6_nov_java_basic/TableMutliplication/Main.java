import java.util.Scanner    ;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table");
        int n = sc.nextInt();
        System.out.println("Table of "+n+" is as follow: ");
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+(i)+" = "+(n*i));
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number on which you want to perform calculation:");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("Choose the operation you want to perform:" +
                "\nEnter 'a' for addition" +
                "\nEnter 's' for subtraction" +
                "\nEnter 'm' for multiplication" +
                "\nEnter 'd' for division");
        
        String opt = sc.next();
        
        switch (opt) {
            case "a":
                System.out.println("Sum of [" + a + ", " + b + "] is: " + add(a, b));
                break;
            case "s":
                System.out.println("Difference of [" + a + ", " + b + "] is: " + sub(a, b));
                break;
            case "m":
                System.out.println("Product of [" + a + ", " + b + "] is: " + mul(a, b));
                break;
            case "d":
                if (b != 0)
                    System.out.println("Division of " + a + "/" + b + " is: " + div(a, b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Unsupported choice!");
        }
        
        System.out.println("Completed!!!");
        sc.close();
    }
    
    // Arithmetic methods
    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        return (double) x / y;
    }
}
 

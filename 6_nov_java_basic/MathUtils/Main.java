class MathUtils {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

}
public class Main{
     public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Max: " + MathUtils.max(num1, num2));
        System.out.println("Min: " + MathUtils.min(num1, num2));
        System.out.println("Average: " + MathUtils.average(num1, num2));
    }

}


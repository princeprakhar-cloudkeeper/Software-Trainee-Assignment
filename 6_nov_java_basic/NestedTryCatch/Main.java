public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Outer try block started.");

            try {
                System.out.println("Accessing element at index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds.");
            }

            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            }

            System.out.println("Outer try block ended.");
        } catch (Exception e) {
            System.out.println("General exception caught in outer try.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}


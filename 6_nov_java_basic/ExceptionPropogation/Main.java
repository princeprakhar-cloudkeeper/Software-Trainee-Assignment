public class Main {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }
    }

    public static void m1() throws Exception {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Exception caught in m1 method: " + e.getMessage());
            throw e;
        }
    }

    public static void m2() throws Exception {
        try {
            m3();
        } catch (Exception e) {
            System.out.println("Exception caught in m2 method: " + e.getMessage());
            throw e;
        }
    }

    public static void m3() throws Exception {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in m3 method: Division by zero");
            throw e;
        }
    }
}


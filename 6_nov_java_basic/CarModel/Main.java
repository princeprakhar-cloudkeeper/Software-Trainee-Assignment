import java.util.Scanner;

class Car {
    private String model;
    private double price;

    public Car(String model) {
        this.model = model;
    }
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Model: " + model);
        if (price != 0) {
            System.out.println("Price: " + price);
        } else {
            System.out.println("Price not set.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car carWithModel = new Car("Nissan GTR");
        carWithModel.displayCarInfo();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the car: ");
        double price = sc.nextDouble();

        Car carWithModelAndPrice = new Car(model, price);
        carWithModelAndPrice.displayCarInfo();

        sc.close();
    }
}

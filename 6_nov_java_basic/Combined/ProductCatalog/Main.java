class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) throws InvalidPriceException {
        this.id = id;
        this.name = name;
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Product product1 = new Product(1, "Laptop", 899.99);
            Product product2 = new Product(2, "Smartphone", 499.99);
            Product product3 = new Product(3, "Headphones", -59.99);
            Product product4 = new Product(4, "Keyboard", 79.99);

            product1.displayProductDetails();
            product2.displayProductDetails();
            product4.displayProductDetails();
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}


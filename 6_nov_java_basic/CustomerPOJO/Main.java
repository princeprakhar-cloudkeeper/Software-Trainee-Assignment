import java.util.*;

class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        
        customers.add(new Customer(1, "Prakhar deep", "prakhardeep173@@gmail.com"));
        customers.add(new Customer(2, "Prince shah", "princeprakhar18@gmail.com"));
        customers.add(new Customer(3, "Anjaneya Agrahari","anitya@gmail.com"));
        
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}


package questionsPack.question10;

public class CoffeeMainClass {
    public static void main(String[] args) {

        Customer customer = new Customer();
        String tokenNumber= customer.order();
        customer.collectCoffee(tokenNumber);

    }
}

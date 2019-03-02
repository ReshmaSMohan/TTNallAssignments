package designPatterns.Q6;

public class Q6TopingsPizza implements Q6Pizza {
   private Q6Pizza pizza;
   private String toping;

    public Q6TopingsPizza(Q6Pizza pizza, String toping) {
        this.pizza = pizza;
        this.toping = toping;
    }

    @Override
    public String getInfo() {
        return pizza.getInfo()+"with topings "+toping;
    }
}

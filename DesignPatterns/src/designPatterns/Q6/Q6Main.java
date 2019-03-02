package designPatterns.Q6;

public class Q6Main {
    public static void main(String[] args) {
        MargherittaPizza margherittaPizza = new MargherittaPizza();
        System.out.println(margherittaPizza.getInfo());

        Q6TopingsPizza topings = new Q6TopingsPizza(margherittaPizza,"corn");
        System.out.println(topings.getInfo());

        topings = new Q6TopingsPizza(new ChickenFiestaPizza(),"extra cheese");
        System.out.println(topings.getInfo());
    }
}

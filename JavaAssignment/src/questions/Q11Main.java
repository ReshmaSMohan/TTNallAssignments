package questions;

public class Q11Main {
    public static void main(String[] args) {
        Q11Bank sbi = new SBI(5,"SBI",50);
        sbi.getDetails();

        Q11Bank boi = new SBI(3,"BOI",70);
        boi.getDetails();

        Q11Bank icici = new SBI(2,"ICICI",85);
        icici.getDetails();

    }
}

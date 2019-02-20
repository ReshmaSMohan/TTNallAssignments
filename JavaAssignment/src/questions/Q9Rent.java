package questions;

public enum Q9Rent {

    MELUHA(20000f),
    SHARMA_NIVAS(13000f),
    HOMESWEETHOME(10000f);


    float rent;

    Q9Rent(float rent) {
        this.rent = rent;
    }

    public float getPrice() {
        return rent;
    }
}

class Main {
    public static void main(String[] args) {
        for (Q9Rent housename : Q9Rent.values()) {
            System.out.println(housename + " : " + housename.getPrice());
        }
    }
}

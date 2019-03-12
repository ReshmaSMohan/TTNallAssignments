package Question3and4;

public class Restaurant {

    private HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return hotDrink.prepareHotDrink();
    }
}

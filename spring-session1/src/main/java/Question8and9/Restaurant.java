package Question8and9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//@Component("restaurantQ9")
public class Restaurant {

//    @Autowired
//    @Qualifier("tea1")
    private HotDrink hotDrink;

    public Restaurant() {
    }

//    @Autowired
    public Restaurant(@Qualifier("tea1") HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    @Autowired
    @Qualifier("tea1")/*teaQ9*/
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return hotDrink.prepareHotDrink();
    }
}

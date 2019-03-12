package Question8and9;

import org.springframework.stereotype.Component;

//@Component("teaQ9")
public class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing Tea";
    }
}

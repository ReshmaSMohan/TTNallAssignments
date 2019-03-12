package Question8and9;

import org.springframework.stereotype.Component;

//@Component("expressTeaQ9")
public class ExpressTea implements HotDrink {
    public ExpressTea() {
    }

    @Override
    public String prepareHotDrink() {
        return "Preparing Express Tea";
    }
}

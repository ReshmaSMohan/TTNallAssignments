package designPatterns.Q6;

public interface Q6Pizza {
    String getInfo();
}

class ChickenFiestaPizza implements Q6Pizza{
    @Override
    public String getInfo() {
        return "Chicken Fiesta Pizza : ";
    }
}

class PeppyPaneerPizza implements Q6Pizza{
    @Override
    public String getInfo() {
        return "Peppy Paneer Pizza : ";
    }
}

class MargherittaPizza implements Q6Pizza{
    @Override
    public String getInfo() {
        return "Margheritta Pizza : ";
    }
}

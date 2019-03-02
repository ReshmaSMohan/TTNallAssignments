package designPatterns.Q5;

public interface Q5Color {
    String getColor();
}

class RedColor implements Q5Color {
    @Override
    public String getColor() {
        return ": red colored";
    }
}

class BlueColor implements Q5Color {
    @Override
    public String getColor() {
        return ": blue colored";
    }
}

class PinkColor implements Q5Color {
    @Override
    public String getColor() {
        return ": pink colored";
    }
}

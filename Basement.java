package space;

public class Basement extends Space{
    public Basement(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public String toString() {
        return "подвала";
    }
}

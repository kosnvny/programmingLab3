package space;

public class Storeroom extends Space{
    public Storeroom(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public String toString() {
        return "кладовой";
    }
}

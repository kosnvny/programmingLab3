package space;

import java.util.Objects;

public class Space {
    private double length;
    private double width;
    private double height;

    public Space(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return Double.compare(length, space.length) == 0 && Double.compare(width, space.width) == 0 && Double.compare(height, space.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }

    @Override
    public String toString() {
        return "Space{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

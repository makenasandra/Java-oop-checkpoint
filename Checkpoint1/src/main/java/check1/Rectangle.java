package check1;

public class Rectangle {
    private double length;
    private double width;

    Rectangle(){}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        double perimeter = 2* (this.width + this.length);
        return perimeter;
    }
}

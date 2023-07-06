package check3;

public class Circle {
    private double radius;

    Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
}

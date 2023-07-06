package check2;

public class Triangle {
    private double base;
    private double height;

    Triangle(){}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return this.base * this.height;
    }
}

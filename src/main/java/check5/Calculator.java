package check5;

public class Calculator {
    private int num1;
    private int num2;

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition(){
        System.out.println(this.num2 + this.num1);
    }

    public void subtraction(){
        System.out.println(this.num1 - this.num2);
    }

    public void multiplication(){
        System.out.println(this.num2 * this.num1);
    }

    public void division(){
        System.out.println(this.num1 / this.num2);
    }

}

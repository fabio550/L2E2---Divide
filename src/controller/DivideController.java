package controller;

public class DivideController {
    public DivideController() {
        super();
    }

    public int CalcDivide(int divisor, int dividendo) {

        if (dividendo - divisor < 0) {
            return dividendo;
        } else {
            return CalcDivide(divisor, dividendo-divisor);
        }
    }
}

package controller;

public class DivideController {
    public DivideController() {
        super();
    }

    public int CalcDivide(int dividendo, int divisor) {

        if (dividendo - divisor < 0) {
            return dividendo;
        } else {
            return CalcDivide(dividendo-divisor, divisor);
        }
    }
}

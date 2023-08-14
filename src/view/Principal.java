package view;
import controller.DivideController;

public class Principal {
    public static void main(String[] args) {
        DivideController dc = new DivideController();

        int res = dc.CalcDivide(5, 29);

        System.out.println(res);

    }
}

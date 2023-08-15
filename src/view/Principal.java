package view;
import controller.DivideController;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        DivideController dc = new DivideController();

        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do divisor:"));


        int res = dc.CalcDivide(dividendo, divisor);

        JOptionPane.showMessageDialog(null, "O resto da divisão de " + dividendo + " por " + divisor + " é " + res);
    }
}

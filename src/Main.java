import javax.swing.*;
import java.lang.Math;

public class Main {
    public static void main (String[] args){

        //oppgave 11

        String tallInput = JOptionPane.showInputDialog("Skriv inn et tall");
        int antallSiffer = tallInput.length();
        int tall = Integer.parseInt(tallInput);
        int sum = 0;

        for (int n = 0; n < antallSiffer; n++){
            double sifferDbl = (tall % Math.pow(10, n+1)) / Math.pow(10, n);
            int siffer = (int)sifferDbl;
            sum = sum + siffer;
        }
        JOptionPane.showMessageDialog(null, "Tverrsummen av tallet er " + sum);
    }
}

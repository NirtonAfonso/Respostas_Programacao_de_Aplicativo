package br.com.poo;

import br.com.poo.modelo.Ponto2D;

import javax.swing.*;
import java.text.DecimalFormat;

public class AppMainPonto2D {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");

        Ponto2D p1 = new Ponto2D();
        p1.setX(2.0);
        p1.setY(1.0);

        Ponto2D p2 = new Ponto2D(3.0, -3.0);
        JOptionPane.showMessageDialog(null, "Distância: " + df.format(p1.calcDistancia(p2)));

        Ponto2D p3 = new Ponto2D(p1);

        Ponto2D p4 = p2.clone();

        JOptionPane.showMessageDialog(null, p2);
        JOptionPane.showMessageDialog(null, p4);

        if(p2.equals(p4)){
            JOptionPane.showMessageDialog(null, "São Iguais!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não são iguais!!");
        }

    }
}

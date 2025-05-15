package br.com.poo;

import br.com.poo.modelo.Contador;

import javax.swing.*;

public class AppMainContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.incrementar();
        JOptionPane.showMessageDialog(null, "Senha: "+contador.getValor());

        contador.incrementar();
        JOptionPane.showMessageDialog(null, "Senha: "+contador.getValor());

        contador.zerar();
        JOptionPane.showMessageDialog(null, "Valor: "+contador.getValor());

    }
}
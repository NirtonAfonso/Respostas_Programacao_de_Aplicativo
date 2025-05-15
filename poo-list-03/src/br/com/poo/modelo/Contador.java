package br.com.poo.modelo;

public class Contador {
    private int valor;

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    public int getValor(){
        return this.valor;
    }
}

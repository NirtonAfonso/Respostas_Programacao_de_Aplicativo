package br.com.poo.modelo;

public class Ponto2D {
    private double x;
    private double y;

    /**
     * Por default (sem parâmetros) na origem do espaço 2D
     */
    public Ponto2D(){

    }

    /**
     * Num local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e ordenada do ponto que está sendo criado)
     * @param x
     * @param y
     */
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Em um local indicado por outro ponto
     * @param ponto
     */
    public Ponto2D(Ponto2D ponto){
        this.x = ponto.getX();
        this.y = ponto.getY();

    }

    /**
     * Na origem do espaço 2S. X = 0 e Y = 0
     */
    public void movimentar(){
        setX(0.0);
        setY(0.0);
    }

    /**
     * No local indicado por X e Y
     * @param x
     * @param y
     */
    public void movimentar(double x, double y){
        setX(x);
        setY(y);
    }

    /**
     * X e Y em um local indicado por um Ponto
     * @param ponto
     */
    public void movimentar(Ponto2D ponto){
        setX(ponto.getX());
        setY(ponto.getY());
    }

    public boolean equals(Ponto2D ponto){
        if(getX() == ponto.getX() && getY() == ponto.getY()){
            return true;
        }
        return false;
        //return getX() == ponto.getX() && getY() == ponto.getY();
    }

    @Override
    public String toString(){
        return "\nX: " + getX() + "\nY: " + getY();
    }

    public Ponto2D clone(){
        return new Ponto2D(this);
//        return new Ponto2D(getX(), getY());
    }

    public double calcDistancia(Ponto2D ponto){
        return Math.sqrt(Math.pow(getX() - ponto.getX(), 2) + Math.pow(getY() - ponto.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

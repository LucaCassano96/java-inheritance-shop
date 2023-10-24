package shop;

import java.math.BigDecimal;



public class Televisore extends Product{

    //ATTRIBUTI TELEVISORE
    private int dimention;
    private boolean smart;


    //COSTRUTTORE TELEVISORE
    public Televisore(String name, String description, BigDecimal price, BigDecimal vat, int dimention, boolean smart) {
        super(name, description, price, vat);
        this.dimention = dimention;
        this.smart = smart;
    }

    //METODI TELEVISORE


    public int getDimention() {
        return dimention;
    }

    public boolean getSmart() {
        return smart;
    }

    public void setDimention(int dimention) {
        this.dimention = dimention;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisore{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                ",dimention=" + dimention +
                ", smart=" + smart +
                '}';
    }
}

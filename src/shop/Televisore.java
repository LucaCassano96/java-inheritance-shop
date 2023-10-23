package shop;

import java.math.BigDecimal;



public class Televisore extends Product{

    //ATTRIBUTI TELEVISORE
    private int dimention;
    private String smart;


    //COSTRUTTORE TELEVISORE
    public Televisore(String name, String description, BigDecimal price, BigDecimal vat, int dimention, String smart) {
        super(name, description, price, vat);
        this.dimention = dimention;
        this.smart = smart;
    }

    //METODI TELEVISORE


    public int getDimention() {
        return dimention;
    }

    public String getSmart() {
        return smart;
    }

    public void setDimention(int dimention) {
        this.dimention = dimention;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }
}

package shop;

import java.math.BigDecimal;


public class Cuffia extends Product{

    //ATTRIBUTI CUFFIE
    private String color;
    private String wireless;
    private String wired;

    //COSTRUTTORE CUFFIE
    public Cuffia(String name, String description, BigDecimal price, BigDecimal vat, String color, String wireless, String wired) {
        super(name, description, price, vat);

        this.color = color;
        this.wireless = wireless;
        this.wired = wired;
    }

    //METODI CUFFIE

    public String getColor() {
        return color;
    }

    public String getWireless() {
        return wireless;
    }

    public String getWired() {
        return wired;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public void setWired(String wired) {
        this.wired = wired;
    }
}

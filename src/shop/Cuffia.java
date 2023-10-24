package shop;

import java.math.BigDecimal;


public class Cuffia extends Product{

    //ATTRIBUTI CUFFIE
    private String color;
    private boolean wireless;


    //COSTRUTTORE CUFFIE
    public Cuffia(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean wireless) {
        super(name, description, price, vat);

        this.color = color;
        this.wireless = wireless;
    }

    //METODI CUFFIE

    public String getColor() {
        return color;
    }

    public boolean getWireless() {
        return wireless;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffia{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}

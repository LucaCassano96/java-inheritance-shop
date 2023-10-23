package shop;

import java.math.BigDecimal;



public class Smartphone extends Product {

    //ATTRIBUTI SMARTPHONE
    private int smartphoneCode;
    private int storage;

    //COSTRUTTORE SMARTPHONE
    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int smartphoneCode, int storage) {
        super(name, description, price, vat);

        this.smartphoneCode = smartphoneCode;
        this.storage = storage;
    }


    //GETTERS
    public int getSmartphoneCode() {
        return smartphoneCode;
    }

    public int getStorage() {
        return storage;
    }

    //SETTERS

    public void setSmartphoneCode(int smartphoneCode) {
        this.smartphoneCode = smartphoneCode;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}

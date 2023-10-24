package shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Product {

    //ATTRIBUTI
 private int code;
 private String name;
 private String description;
 private BigDecimal price;
 private BigDecimal vat;

    //COSTRUTTORE

 public Product(String name, String description, BigDecimal price, BigDecimal vat) {
  this.name = name;
  this.description = description;
  this.price = price;
  this.vat = vat;
  this.code = generateCode();
 }


 //METODI


 //metodi getter

 public int getCode() {
  return code;
 }

 public String getName() {
  return name;
 }

 public String getDescription() {
  return description;
 }

 public BigDecimal getPrice() {
  return price;
 }

 public BigDecimal getVat() {
  return vat;
 }


 //metodi setter

 public void setName(String name) {
  this.name = name;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public void setPrice(BigDecimal price) {
  this.price = price;
 }

 public void setVat(BigDecimal vat) {
  this.vat = vat;
 }

 //codice random
 private int generateCode() {
  Random random = new Random();
  return random.nextInt(1, 10000);
 }

 // metodo prezzo con iva

 public BigDecimal getFullPrice(){
  return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
 }

 // metodo full name

 public String fullName(){
  return code + "-" + name;
 }


 // metodo createProduct comune a tutti i prodotti

 public static Product createProduct(Scanner scanner) {
  System.out.print("Name: ");
  String name = scanner.nextLine();
  System.out.print("Description: ");
  String description = scanner.nextLine();
  System.out.print("Price: ");
  BigDecimal price = new BigDecimal(scanner.nextLine());
  System.out.print("Vat: ");
  BigDecimal vat = new BigDecimal(scanner.nextLine());

  // Restituisci un oggetto Product con gli attributi inseriti
  return new Product(name, description, price, vat);
 }

 // metodo ToString

 @Override
 public String toString() {
  return "Product{" +
          "code=" + code +
          ", name='" + name + '\'' +
          ", description='" + description + '\'' +
          ", price=" + price +
          ", vat=" + vat +
          '}';
 }
}



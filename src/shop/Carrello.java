package shop;

//Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chiedo quanti prodotti vuole inserire
        System.out.println("Quanti prodotti vuoi acquistare?");
        int numeroProdottiDaAcquistare = scanner.nextInt();

        // con questa dimensione creo un array di Product
        Product[] carrello = new Product[numeroProdottiDaAcquistare];

        // per ogni posizione dell'array carrello devo chiedere di inserire un prodotto

        for (int i = 0; i < carrello.length; i++) {

            System.out.println("inserisci prodotto " + (i + 1));
            System.out.println("Che prodotto vuoi inserire? 1-Smartphone 2-televisore 3-Cuffia");

            int tipoDiProdotto = scanner.nextInt();
            scanner.nextLine();

            if (tipoDiProdotto == 1) {
                System.out.println("Smartphone");
                Product product = Product.createProduct(scanner); // Crea un oggetto Product con attributi comuni

                System.out.print("smartphoneCode: ");
                int smartphoneCode = Integer.parseInt(scanner.nextLine());
                System.out.print("Storage (GB): ");
                int storage = Integer.parseInt(scanner.nextLine());

                Smartphone nuovoSmartphone = new Smartphone(product.getName(), product.getDescription(), product.getPrice(), product.getVat(), smartphoneCode, storage);

                // Ora puoi inserire l'oggetto Smartphone nel carrello
                carrello[i] = nuovoSmartphone;

            } else if (tipoDiProdotto == 2) {
                System.out.println("Televisore");

                Product product = Product.createProduct(scanner); // Crea un oggetto Product con attributi comuni

                System.out.print("dimention: ");
                int dimention = Integer.parseInt(scanner.nextLine());

                System.out.print("Smart?y/n ");
                boolean smart = scanner.nextLine().equalsIgnoreCase("y"); //In breve, questo codice legge l'input dell'utente e assegna true alla variabile smart se l'utente inserisce "y" (ignorando maiuscole/minuscole), altrimenti assegna false.

                Televisore nuovoTelevisore = new Televisore(product.getName(), product.getDescription(), product.getPrice(), product.getVat(), dimention, smart);

                // Ora puoi inserire l'oggetto Televisore nel carrello
                carrello[i] = nuovoTelevisore;

            }else if (tipoDiProdotto == 3){
                System.out.println("Cuffia");

                Product product = Product.createProduct(scanner); // Crea un oggetto Product con attributi comuni

                System.out.print("color: ");
                String color = scanner.nextLine();

                System.out.print("wireless? y/n ");
                boolean wireless = scanner.nextLine().equalsIgnoreCase("y"); //In breve, questo codice legge l'input dell'utente e assegna true alla variabile smart se l'utente inserisce "y" (ignorando maiuscole/minuscole), altrimenti assegna false.

                Cuffia nuoveCuffie = new Cuffia(product.getName(), product.getDescription(), product.getPrice(), product.getVat(), color, wireless);

                // Ora puoi inserire l'oggetto Televisore nel carrello
                carrello[i] = nuoveCuffie;

            }else {
                System.out.println("Inserisci un numero valido");
                i--;
            }


        }

        // itero sul carrello per mostrare i vari prodotti e calcolare il totale
        BigDecimal total = new BigDecimal(0);
        for (Product p : carrello) {
            System.out.println(p);
            // aggiorno il totale
            total = total.add(p.getFullPrice());
        }
        System.out.println("TOTAL: " + total + "€");



        scanner.close();
}
}
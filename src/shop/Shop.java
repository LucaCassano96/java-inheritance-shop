package shop;

//Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.

import java.math.BigDecimal;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi acquistare?");
        int numeroProdottiDaAcquistare = scanner.nextInt();

        Product[] carrello = new Product[numeroProdottiDaAcquistare];
        int numeroProdotti = 0;

        scanner.nextLine(); // Consuma il newline residuo dopo il nextInt()

        while (true) {
            System.out.println("Inserisci il tipo di prodotto (Smartphone, Cuffie, Televisore) o 'fine' per uscire:");
            String tipoProdotto = scanner.nextLine();

            if (tipoProdotto.equalsIgnoreCase("fine")) {
                break;
            }

            System.out.println("Inserisci il nome del prodotto:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            BigDecimal prezzo = scanner.nextBigDecimal();
            scanner.nextLine();


            if (tipoProdotto.equals("Smartphone")) {
                System.out.println("Inserisci il modello dello smartphone:");
                String modello = scanner.nextLine();
                carrello[numeroProdotti] = new Smartphone(nome, "", prezzo, new BigDecimal("0.20"), 3454, 256);
            } else if (tipoProdotto.equals("Cuffie")) {
                System.out.println("Inserisci il tipo di cuffie:");
                String tipo = scanner.nextLine();
                carrello[numeroProdotti] = new Cuffia(nome, "", prezzo, new BigDecimal("0.20"), tipo, "", "");
            } else if (tipoProdotto.equals("Televisore")) {
                System.out.println("Inserisci la dimensione del televisore (pollici):");
                int dimensione = scanner.nextInt();
                scanner.nextLine();
                carrello[numeroProdotti] = new Televisore(nome, "", prezzo, new BigDecimal("0.20"), dimensione, "");
            } else {
                System.out.println("Tipo di prodotto non riconosciuto. Riprova.");
            }

            numeroProdotti++;

        }BigDecimal prezzoTotale = BigDecimal.ZERO;

        System.out.println("Prodotti nel carrello:");
        for (int i = 0; i < numeroProdotti; i++) {
            Product prodotto = carrello[i];
            System.out.println("Nome: " + prodotto.getName());
            System.out.println("Prezzo: " + prodotto.getFullPrice());
            System.out.println("Codice: " + prodotto.getCode());
            prezzoTotale = prezzoTotale.add(prodotto.getFullPrice());
            System.out.println("Prezzo totale: " + prezzoTotale );
        }
}
}
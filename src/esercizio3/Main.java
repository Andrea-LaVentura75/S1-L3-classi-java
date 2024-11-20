package esercizio3;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni articoli
        Articolo articolo1 = new Articolo("A001", "Smartphone", 399.99, 10);
        Articolo articolo2 = new Articolo("A002", "Laptop", 899.99, 5);
        Articolo articolo3 = new Articolo("A003", "Cuffie Wireless", 59.99, 20);

        // Creazione di un cliente
        Cliente cliente = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", "2024-11-20");

        // Creazione di un carrello per il cliente
        Carrello carrello = new Carrello(cliente);

        // Aggiunta di articoli al carrello
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);
        carrello.aggiungiArticolo(articolo3);

        // Mostra articoli nel carrello
        System.out.println("Articoli nel carrello di " + cliente.nome + " " + cliente.cognome + ":");
        carrello.mostraArticoli();

        // Calcola il totale costo degli articoli nel carrello
        double totaleCosto = carrello.calcolaTotaleCosto();
        System.out.println("Totale costo articoli: " + totaleCosto + " EUR");
    }
}

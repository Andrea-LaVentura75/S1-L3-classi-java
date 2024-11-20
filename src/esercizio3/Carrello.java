package esercizio3;

import java.util.ArrayList;

public class Carrello {
    Cliente clienteAssociato;
    ArrayList<Articolo> elencoArticoli;

    // Costruttore
    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
    }

    // Aggiungi articolo al carrello
    public void aggiungiArticolo(Articolo articolo) {
        if (articolo.pezziDisponibili > 0) {
            elencoArticoli.add(articolo);
            articolo.pezziDisponibili -= 1;
        } else {
            System.out.println("Articolo non disponibile in magazzino.");
        }
    }

    // Calcola il costo totale degli articoli nel carrello
    public double calcolaTotaleCosto() {
        double totale = 0;
        for (Articolo articolo : elencoArticoli) {
            totale += articolo.prezzo;
        }
        return totale;
    }

    // Mostra articoli nel carrello
    public void mostraArticoli() {
        for (Articolo articolo : elencoArticoli) {
            System.out.println(articolo.descrizioneArticolo + " - Prezzo: " + articolo.prezzo + " EUR");
        }
    }
}

package esercizio3;

public class Articolo {
    String codiceArticolo;
    String descrizioneArticolo;
    double prezzo;
    int pezziDisponibili;

    // Costruttore
    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }
}

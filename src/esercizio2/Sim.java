package esercizio2;

import java.util.Arrays;

public class Sim {

    int numeroCellulare;
    int credito;
    int[] registroChiamate;

    // Costruttore
    public Sim(int numeroCellulare) {
        this.numeroCellulare = numeroCellulare;
        this.credito = 0;
        this.registroChiamate = new int[5]; // Array di 5 elementi inizializzato a 0
    }

    // Getter e Setter (facoltativi)
    public int[] getRegistroChiamate() {
        return registroChiamate;
    }

    public void setRegistroChiamate(int[] registroChiamate) {
        if (registroChiamate.length == 5) {
            this.registroChiamate = registroChiamate; // Solo se l'array ha 5 elementi
        } else {
            System.out.println("L'array deve avere esattamente 5 elementi.");
        }
    }

    public void stampaInfoSim(){
        System.out.println("numero di cellulare:"+ numeroCellulare+" credito:"+credito+" registro chiamate:"+ Arrays.toString(registroChiamate));
    }

    public static void main(String[] args) {
        Sim sim1= new Sim(154185965);
        sim1.stampaInfoSim();

        Sim sim2= new Sim(487525596);
        sim2.stampaInfoSim();
    }


}

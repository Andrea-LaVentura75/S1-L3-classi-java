package esercizio1;

public  class Rettangolo {

   private int altezza;
    private int larghezza;

    private int altezza2;
    private int larghezza2;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza=altezza;
        this.larghezza=larghezza;
    }

    public void stampaPerimetroArea(){
      int  perimetro= (altezza + larghezza)*2;
      int area= (altezza * larghezza);
        System.out.println("il perimetro è:"+perimetro+",l'area è:"+area);
    }

    public static void stapaDueRettangoli(Rettangolo ret1, Rettangolo ret2){
        int areaPrimoRettangolo = ret1.altezza * ret1.larghezza;
        int perimetroPrimoRettangolo = 2 * (ret1.altezza + ret1.larghezza);
        int areaSecondoRettangolo = ret2.altezza * ret2.larghezza;
        int perimetroSecondoRettangolo = 2 * (ret2.altezza + ret2.larghezza);

        int sommaArea = areaPrimoRettangolo + areaSecondoRettangolo;
        int sommaPerimetro = perimetroPrimoRettangolo + perimetroSecondoRettangolo;
        System.out.println("area primo rettangolo" + " " + areaPrimoRettangolo);
        System.out.println("perimetro primo rettangolo" + " " + perimetroPrimoRettangolo);
        System.out.println("area secondo rettangolo" + " " + areaSecondoRettangolo);
        System.out.println("perimetro secondo rettangolo" + " " + perimetroSecondoRettangolo);


        System.out.println("area rettangolo" + " " + sommaArea);
        System.out.println("perimetro rettangolo" + " " + sommaPerimetro);
    }


    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(10,15);
        Rettangolo rettangolo2 = new Rettangolo(17,18);

        rettangolo1.stampaPerimetroArea();

        Rettangolo.stapaDueRettangoli(rettangolo1,rettangolo2);
    }




}





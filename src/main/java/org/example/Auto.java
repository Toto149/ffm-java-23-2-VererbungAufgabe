package org.example;

public class Auto extends Fahrzeug{
    int anzahlDerTueren;

    public Auto(){
        super();
    }
    public Auto(String hersteller, String modell, int baujahr,int anzahlDerTueren){
        super(hersteller, modell, baujahr);
        this.anzahlDerTueren = anzahlDerTueren;
    }

    public void fahrzeugInforamtionen(){
        super.fahrzeugInformationen();
        System.out.println("Anzahl der Türen: " + anzahlDerTueren);
        //return "Das Auto ist vom Hersteller %s, das Modell ist %s vom Baujahr %d und es hat %d Türen"
        //        .formatted(this.hersteller,this.modell,this.baujahr,this.anzahlDerTueren);
    }
}

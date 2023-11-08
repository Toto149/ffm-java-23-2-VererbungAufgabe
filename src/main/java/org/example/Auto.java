package org.example;

public class Auto extends Fahrzeug{
    int anzahlDerTueren;

    public Auto(){
        super();
    }
    public Auto(int anzahlDerTueren){
        super();
        this.anzahlDerTueren = anzahlDerTueren;
    }

    public String fahrzeugInforamtionen(){
        return "Das Auto ist vom Hersteller %s, das Modell ist %s vom Baujahr %d und es hat %d Türen"
                .formatted(this.hersteller,this.modell,this.baujahr,this.baujahr);
    }
}

package org.example;

public class Fahrzeug {
    String hersteller;
    String modell;
    int baujahr;
    public Fahrzeug(){

    }
    public Fahrzeug(String hersteller, String modell, int baujahr){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;

    }
    public String fahrzeugInformationen(){
        return "Der Hersteller ist %s, das Modell ist %s und das Baujahr ist %d".formatted(hersteller,modell, baujahr);

    }
}

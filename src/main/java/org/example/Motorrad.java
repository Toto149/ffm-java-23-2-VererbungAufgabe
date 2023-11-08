package org.example;

public class Motorrad extends Fahrzeug {
    public String motorradTyp;

    public Motorrad(){

    }
    public Motorrad(String hersteller,String modell,int baujahr,String motorradTyp){
        super(hersteller,modell,baujahr);
        this.motorradTyp = motorradTyp;

    }

    @Override
    public void fahrzeugInformationen() {
        super.fahrzeugInformationen();
        System.out.println("Der Typ des Motorrades ist: " + motorradTyp);

    }
}

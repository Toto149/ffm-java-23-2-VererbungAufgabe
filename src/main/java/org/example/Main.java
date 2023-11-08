package org.example;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Fahrzeug("VW","Golf",1999);
        fahrzeug.fahrzeugInformationen();
        Auto auto = new Auto("VW", "Golf",1999,4);
        auto.fahrzeugInforamtionen();
        Motorrad motorrad = new Motorrad("Kawasaki", "Hayabusa", 1999, "Sportsbike");
        motorrad.fahrzeugInformationen();

    }
}
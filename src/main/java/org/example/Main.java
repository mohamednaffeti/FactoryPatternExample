package org.example;

import Factory.AvionFactory;
import Factory.VehiculeFactory;
import Factory.VoitureFactory;
import Vehicule.Vehicule;
import Vehicule.Voiture;

public class Main {
    public static void main(String[] args) {

        VehiculeFactory voiture = new VoitureFactory();
        Vehicule golf= voiture.creerVehicule();
        golf.seDeplacer();
        VehiculeFactory Avion= new AvionFactory();
        Vehicule avion= Avion.creerVehicule();
        avion.seDeplacer();

    }
}
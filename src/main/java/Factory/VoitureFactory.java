package Factory;

import Vehicule.Vehicule;
import Vehicule.Voiture;

public class VoitureFactory implements VehiculeFactory{
    @Override
    public Vehicule creerVehicule() {
        return new Voiture();
    }
}

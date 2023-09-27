package Factory;

import Vehicule.Vehicule;
import Vehicule.Avion;
public class AvionFactory implements VehiculeFactory{
    @Override
    public Vehicule creerVehicule() {
        return new Avion();
    }
}

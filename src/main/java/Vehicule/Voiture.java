package Vehicule;

public class Voiture implements Vehicule{

    @Override
    public void seDeplacer() {
        System.out.println("cette voiture se déplace de ville en ville");
    }
}

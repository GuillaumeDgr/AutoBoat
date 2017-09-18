package fr.wcs.autoboat;

/**
 * Created by apprenti on 9/18/17.
 */

public class Car extends Vehicule {

    //Attributs
    private String kilometers;

    //Constructeurs
    public Car(String brand, String model, String kilometers) {
        super(brand, model);
        this.kilometers = kilometers;
    }

    //Getters
    public String getKilometers() {
        return kilometers;
    }

    //Setters
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nNombre de kilomètres : " + getKilometers();
    }
}

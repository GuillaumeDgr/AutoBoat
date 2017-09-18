package fr.wcs.autoboat;

/**
 * Created by apprenti on 9/18/17.
 */

public class Boat extends Vehicule {

    //Attributs
    private String hours;

    //Constructeurs
    public Boat(String brand, String model, String hours) {
        super(brand, model);
        this.hours = hours;
    }

    //Getters
    public String getHours() {
        return hours;
    }

    //Setters
    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nNombre d'heures : " + hours;
    }
}

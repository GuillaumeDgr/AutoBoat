package fr.wcs.autoboat;

/**
 * Created by apprenti on 9/18/17.
 */

public class Moto extends Vehicule {

    private String power;

    public Moto(String brand, String model, String power) {
        super(brand, model);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nPuissance : " + power;
    }
}

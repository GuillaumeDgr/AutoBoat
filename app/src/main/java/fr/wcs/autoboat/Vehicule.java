package fr.wcs.autoboat;

/**
 * Created by apprenti on 9/18/17.
 */

public class Vehicule {

    //Attributs
    private String brand;
    private String model;

    //Constructeurs
    public Vehicule(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getDescription() {
        getBrand();
        getModel();
        return String.format("Marque : %1$s, \nModèle : %2$s", brand, model);
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
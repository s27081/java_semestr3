package pl.pjatk.zieorl;

public class Car {
    private String brand;

    private String model;

    private int yearProduction;

    public Car(String brand, String model, int yearProduction) {
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
    }

    public Car(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }
}

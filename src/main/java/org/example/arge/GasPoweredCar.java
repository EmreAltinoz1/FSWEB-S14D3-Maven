package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLiter) {
        super(name, description);
        this.cylinders = cylinders;
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return getName() + " engine starts with a rumble!";  // String döndürüyoruz
    }

    @Override
    public String drive() {
        return getName() + " is driving with a roar";  // String döndürüyoruz
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar's engine is running...");
    }
}


package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, int batterySize, double avgKmPerCharge) {
        super(name, description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return getName() + " powers on silently!";  // String döndürüyoruz
    }

    @Override
    public String drive() {
        return getName() + " is driving silently";  // String döndürüyoruz
    }

    @Override
    protected void runEngine() {
        System.out.println("ElectricCar's motor is whirring...");
    }
}


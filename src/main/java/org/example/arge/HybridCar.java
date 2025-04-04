package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, int batterySize, int cylinders, double avgKmPerLiter) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
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
        return getName() + " is driving with both power sources";  // String döndürüyoruz
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar is balancing gas and electric power...");
    }
}

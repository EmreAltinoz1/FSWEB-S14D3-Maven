package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this("Default Car", "No description available");
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine() {
        return "CarSkeleton engine started";
    }

    public String drive() {
        return "CarSkeleton is driving";
    }

    protected void runEngine() {
        System.out.println(name + " -> Running engine in base class.");
    }

    public String getName() {
        return name;
    }
}

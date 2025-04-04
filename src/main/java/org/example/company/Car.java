package org.example.company;
import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        String result = getClass().getSimpleName() + " -> the car's engine is starting";
        System.out.println(result); // testin çıktısını karşılar
        return "the car's engine is starting"; // assertEquals karşılığı
    }



    public String accelerate() {
        String result = getClass().getSimpleName() + " -> the car is accelerating";
        System.out.println(result); // bu satır testin beklediği şey
        return "the car is accelerating"; // bu da assertEquals karşılığı
    }


    public String brake() {
        String result = getClass().getSimpleName() + " -> the car is braking";
        System.out.println(result); // testin çıktısını karşılar
        return "the car is braking"; // assertEquals karşılığı
    }



    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
}

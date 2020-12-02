package src.Constructors;

import java.util.jar.Attributes.Name;

class Vehicle {
    int wheels;
    String name;
    int headLights;

    public void run() {
        System.out.print("It is running. ");
    }

    Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
        headLights = 2;
    }
}

public class VehicleList {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, "Swift");
        Vehicle scooty = new Vehicle(2, "Yamaha");
        System.out.println(
                "The car " + car.name + " has " + car.wheels + " wheels and " + car.headLights + " headlights.");
        System.out.println("Then " + car.name + " has " + scooty.wheels + " wheels and " + scooty.headLights
                + " headlights and  ");
        car.run();
    }
}

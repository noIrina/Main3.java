package com.company;


public class Car {

    public String color;
    public String motor;
    public int number;

    public Car(String color, String motor, int number) {
        this.color = color;
        this.motor = motor;
        this.number = number;
    }


    public static void main(String[] args) throws Exception {
        CarTest carTest = new CarTest();
        carTest.gevNumber(new Car("gray", "motor", 2), 8);

        carTest.gevColor(new Car("gray", "motor", 2), new Car("blu", "motor", 2));
    }
}


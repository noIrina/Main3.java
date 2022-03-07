package com.company;

public class CarTest {
//    Car car1 = new Car("back", "motor",5);
//    Car car2 = new Car("back", "motor",1);
//    Car car3 = new Car("gray", "motor",2);

    public void gevNumber (Car car2, int number){
     car2.number = number;
        System.out.println(number);
    }

    public void gevColor (Car car2, Car car3){
        String color4 = car2.color;
        car2.color = car3.color;
        car3.color = color4;
        System.out.println(car2.color + " " + car2.motor + " " + car2.number);
        System.out.println(car3.color + " " + car3.motor + " " + car3.number);
    }


}

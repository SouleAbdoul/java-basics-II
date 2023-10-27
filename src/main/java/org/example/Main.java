package org.example;

import org.example.Inheritance.Cat;
import org.example.abstraction.Car;
import org.example.abstraction.Truck;
import org.example.composition.Table;
import org.example.encapsulation.Employee;
import org.example.polymorphism.GooglePhone;
import org.example.polymorphism.Iphone;

public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());
        var myTable = new Table(4);
        Car car = new Car();
        car.vehDrive();
        Truck truc = new Truck();
        truc.vehDrive();
        Employee emp = new Employee("Aiden","Ross", (byte) 22,123456789,70000.0);
        emp.speak();
        var googlephone = new GooglePhone();
        var iphone = new Iphone();
        System.out.println(googlephone.call());
        System.out.println(iphone.call());
    }
}
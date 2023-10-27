package org.example.encapsulation;

public class Employee extends Person{
    private double salary;
    public Employee(String firstName, String lastName, Byte age, Integer ssn , double salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void speak(){
        System.out.println("My name is " + " " + this.getFirstName()+ " " + this.getLastName() + " " + " and my salary is " + " " + this.getSalary());
    }

}

package org.example.Inheritance;

public class Cat {
    // Data...
   private String name;
   public Cat(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
}
    @Override
    public String toString() {
        return "This is: " + name;
    }
}

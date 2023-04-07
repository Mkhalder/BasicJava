package OOP; // Object Oriented Program

public class Cow extends Animal {

    public static void main(String[] args) {
        Cow c = new Cow();
        c.bloodType = "A+";
        c.heightInFeet = 7;
        c.weightInKg = 9;
        c.animalType = "c";
        c.showInfo();
    }
}


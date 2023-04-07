package OOP;

public class Animal {
    protected float heightInFeet;
    protected float weightInKg;
    protected String animalType;
    protected String bloodType;


    public void showInfo() {
        System.out.println("Animal height= " + heightInFeet + "\n" + "Weight kg=" + weightInKg + "\n" + "animalType=" + animalType + "\n" + "bloodType=" + bloodType);
    }
}
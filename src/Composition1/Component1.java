package Composition1;

public class Component1 {
    private String brand;
    private String size;
    private String type;

    public Component1(){
        this.brand= "ewty";
        this.size = "4inch";
        this.type=" led";

    }
    public Component1(String brand, String size, String type){
        this.brand = brand;
         this.type = type;
         this.size = size;

    }

    @Override
    public String toString() {
        return "Component1{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
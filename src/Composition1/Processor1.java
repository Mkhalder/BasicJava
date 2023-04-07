package Composition1;

public class Processor1 {
    private String brand;
    private String memory;
    private String serise;

    public Processor1(){
        this.brand = "Intel";
        this.memory = "4gb";
        this.serise = "uyyy";

    }
    public Processor1(String brand, String memory, String serise){
        this.brand =brand;
        this.memory = memory;
        this.serise= serise;

    }

    @Override
    public String toString() {
        return "Processor1{" +
                "brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                ", serise='" + serise + '\'' +
                '}';
    }
}
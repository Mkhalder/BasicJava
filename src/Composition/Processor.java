package Composition;

public class Processor {
    private String brand;
    private String series;
    private String generation;


    public Processor(){
        this.brand= "Intel";
        this.series= "Core-i7";
        this.generation =" 3rd";

    }
    public Processor( String brand, String series, String generation){
        this.brand = brand;
        this.series = series;
        this.generation= generation;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation='" + generation + '\'' +
                '}';
    }
}

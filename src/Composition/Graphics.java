package Composition;

public class Graphics {
    private String brand;
    private String series;
    private String memories;

    public Graphics(){
        this.brand ="EVGA";
        this.series = "RTX40";
        this.memories = "1GB";

    }
    public Graphics(String brand, String series, String memories){
        this.brand =brand;
        this.series = series;
        this.memories=memories;
    }

    @Override
    public String toString() {
        return "Graphics{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", memories='" + memories + '\'' +
                '}';
    }
}

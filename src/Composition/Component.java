package Composition;

public class Component {
    private String brand;
    private String size;
    private String type;

    public Component(){
        this.brand ="hp";
        this.size= "14inch";
        this.type = "LCD";
    }

    public Component(String brand, String size, String type){
        this.brand = "brand";
        this.size = "size";
        this.type = "type";
    }

    @Override
    public String toString() {
        return "Component{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

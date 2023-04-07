package Composition1;

public class Graphics1 {
    public String brand;
    public String speed;
    public String generaton;


    public Graphics1(){
        this.brand =" hdgg";
        this.speed = " 34fg";
        this.generaton = "3rd";
    }
    public Graphics1(String brand, String speed, String generaton){
        this.brand= brand;
        this.speed = speed;
        this.generaton = generaton;
    }

    @Override
    public String toString() {
        return "Graphics1{" +
                "brand='" + brand + '\'' +
                ", speed='" + speed + '\'' +
                ", generaton='" + generaton + '\'' +
                '}';
    }
}
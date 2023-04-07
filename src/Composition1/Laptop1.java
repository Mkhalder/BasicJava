package Composition1;

import javafx.stage.Screen;

public class Laptop1 {
    private String Screen;
    private String Ram;
    private String HDD;
    private String OpticalDrive;
    private Processor1 processor1;
    private Graphics1 graphics1;
    private Component1 component1;


    public Laptop1() {
        this.Screen = "LED";
        this.HDD = "5TB";
        this.Ram = "16GB";
        this.OpticalDrive = "DVDRom";
        this.graphics1 = new Graphics1();
        this.processor1 = new Processor1();
        this.component1 = new Component1();

    }

    @Override
    public String toString() {
        return "Laptop1{" +
                "Screen='" + Screen + '\'' +
                ", Ram='" + Ram + '\'' +
                ", HDD='" + HDD + '\'' +
                ", OpticalDrive='" + OpticalDrive + '\'' +
                ", processor1=" + processor1 +
                ", graphics1=" + graphics1 +
                ", component1=" + component1 +
                '}';
    }

    public Laptop1(String Screen, String HDD, String ram, String opticalDrive, Graphics1 graphics1, Processor1 processor1, Component1 component1) {
        this.Screen = Screen;
        this.HDD = HDD;
        this.Ram = ram;
        this.OpticalDrive = opticalDrive;
        this.processor1 = processor1;
        this.graphics1 = graphics1;
        this.component1 = component1;
    }
}
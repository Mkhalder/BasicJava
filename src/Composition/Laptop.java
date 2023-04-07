package Composition;

public class Laptop {

    protected String Screen;
    private Processor processor;
    private String ram;
    private String hrdDrive;
    private Graphics graphics;
    private String opticalDrive;
    private String keyboard;
    private Component component;

    public Laptop(){
        this.Screen = "Led";
        this.processor = new Processor();
        this.ram = "32GB";
        this.hrdDrive = "8TB";
        this.graphics = new Graphics();
        this.opticalDrive = "DVD-RW";
        this.keyboard = "A4 Tech";
        this.component = new Component();


        }

    @Override
    public String toString() {
        return "Laptop{" +
                "Screen='" + Screen + '\'' +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hrdDrive='" + hrdDrive + '\'' +
                ", graphics=" + graphics +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", component=" + component +
                '}';
    }

    public Laptop(String Screen, Processor processor, String ram, String hrdDrive, Graphics graphics, String opticalDrive, String keyboard, Component component){
        this.Screen =Screen;
        this.processor = processor;
        this.ram = ram;
        this.hrdDrive =hrdDrive;
        this.graphics= graphics;
        this.opticalDrive= opticalDrive;
        this.keyboard= keyboard;
        this.component = component;


    }

}

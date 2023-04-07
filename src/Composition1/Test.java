package Composition1;

public class Test {
    public static void main(String[] args) {
        Laptop1 la = new Laptop1();
        System.out.println(la);//default
        Processor1 processor1 = new Processor1();
        Graphics1 graphics1 = new Graphics1();
        Component1 component1 = new Component1();
        Laptop1 l = new Laptop1("led", "6tb", "32Gb", "DVDRom", graphics1, processor1, component1);
        System.out.println(l);
    }
}


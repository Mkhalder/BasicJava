package Composition;

public class Controller {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        System.out.println(lap); //default
        Processor processor = new Processor();
        Graphics graphics = new Graphics();
        Component component = new Component();
        Laptop l = new Laptop("Lcd",processor , "16GB","5TB",graphics,"DVD-RW", "A4 Tech",component);
        System.out.println(l);
    }
}

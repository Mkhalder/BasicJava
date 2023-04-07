package Abstract;

public class Control {
    public static void main(String[] args) {
        Person Manotosh = new Veg();
        Person Ma = new NonVeg();
        Manotosh.a();
        Manotosh.eat();
        Ma.a();
        Ma.eat();
    }
}

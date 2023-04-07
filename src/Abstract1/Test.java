package Abstract1;

public class Test {
    public static void main(String[] args) {
        Laptop a = new hp();
        Laptop b = new Dell();
        a.a();
        a.power();
        b.a();
        b.power();
    }
}

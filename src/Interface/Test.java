package Interface;

public class Test {
    public static void main(String[] args) {
        MI M = new MI();
        Nokia N = new Nokia();
        M.Screen();
        M.RAM();
        M.Processor();
        M.ROM();
        M.OS();

        N.Screen();
        N.RAM();
        N.ROM();
        N.Processor();
        N.OS();

        System.out.println(M.Screen());
        System.out.println(M.Processor());
        System.out.println(M.RAM());
        System.out.println(M.ROM());
        System.out.println(M.OS());

        System.out.println();

        System.out.println(N.Screen());
        System.out.println(N.Processor());
        System.out.println(N.RAM());
        System.out.println(N.ROM());
        System.out.println(N.OS());
    }
}

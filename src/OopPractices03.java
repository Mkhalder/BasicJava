public class OopPractices03 {
    public void mm() {
        System.out.println("mano");
    }
    public void ss(int x, int y){
        System.out.println(x*y);
    }
    public void obj(int a, int b){
        System.out.println(a-b);
    }

    public String test (String name, String y){
        String sum = name+ " "+ y;
        return sum;
    }

    public static void main(String[] args) {
        OopPractices03 a= new OopPractices03();
//        a.mm();

//        int length= 65;
//        int length1 = 5;
//        a.ss(length1, length);

//        int h =52;
//        int m= 3;
//        a.obj(h, m);


            String name = "Manotosh";
            String y = "Halder";
            String z = a.test( name, y );

            System.out.println(z);

    }
}
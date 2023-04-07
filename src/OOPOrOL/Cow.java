package OOPOrOL;

public class Cow extends Animal {

    public void Test() {//Overriding
        System.out.println("Mano");
    }
    public void Test1(int x, int y){//Overriding
    System.out.println(x+ " " +y);
}
    public void Test3(String Name){//Overload
    System.out.println(Name + "");
}
    public void Test3(int Age){//Overload
        System.out.println(Age+ "");
    }
    public static void main(String[] args) {
        Cow c = new Cow();
        c.Test();//Overriding
        c.Test1(7,7);//Overriding
        c.Test3("Mano");//Overload
        c.Test3(9);//overload

    }
}

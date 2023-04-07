package OOPOrOL;

public class Animal {


    public void Test() {//overriding
        System.out.println("Manotosh");
    }
    public void Test1(int x, int y){//overriding
        System.out.println(x+ " "+y);
    }
    public void Test2(int x){//Overload
        System.out.println(x+"");
    }
    public void Test2(int x, int y){////Overload
        System.out.println(x+ " "+y);
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.Test();//overriding
        a.Test1(4,7);//overriding
        a.Test2(4);//Overload
        a.Test1(3,3);//Overload
    }
}
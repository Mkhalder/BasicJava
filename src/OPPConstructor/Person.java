package OPPConstructor;

public class Person {

    public Person(){//Default Constructor

        System.out.println("Nothing Value");
    }

    public Person(int x){//Parametrized Constructor

        System.out.println(x+ "");
    }
    public Person(int x, int y){//Parametrized Constructor

        System.out.println(x+ " "+y);
    }

    public static void main(String[] args) {
        Person pr = new Person();
        Person pp = new Person(8);//Parametrized Constructor
        Person p = new Person(5,0);//Parametrized Constructor
    }
}

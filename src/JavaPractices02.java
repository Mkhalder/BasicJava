public class JavaPractices02 {
 public void name(){
     System.out.println("He is young");
    }
    public void login(){
        System.out.println("Man");
    }
    public void test(){
     System.out.println("Automation test");
    }
    public void test(int x){
        System.out.println(x);
    }
    public void test2(int x, int y){
        System.out.println(x+y);
    }
    public void obj(int x,int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        JavaPractices02 a = new JavaPractices02();
//        a.name();
//
//        a.login();

//        a.test();

//        int size= 5;
//       a.test(size);


//        int b= 56;
//        int c= 6;
//        a.test(b,c);

//        int length = 34;
//        int length2 =20;
//        a.test2(length, length2);


        int size =56;
        int size2= 24;
        a.obj(size, size2);

    }

}


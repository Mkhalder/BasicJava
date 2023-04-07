public class ReturnOop {

    public int newFunction(){
        int w=20;
        int u=8;
        int sub=w-u;
        return sub;
    }
    public int obj(){
        int x= 65, y=4;
        int mul= x*y;
        return mul;
    }
    public int length(){
        int x= 44, y=22;
        int sum=x+y;
        return sum;
    }
    public int login(){
        int a= 36;
        int b= 12;
        int div= a/b;
        return div;
    }
    public int value(){
        int x= 66;
        int y= 33;
        int sum= x+y;
        return sum;
    }

    public String test (String name, String y){
        String sum = name+ " "+ y;
        return sum;
    }
    public static void main(String[] args) {
        ReturnOop a = new ReturnOop();
//        int c=a.newFunction();
//        System.out.println(c);

//      int r=  a.obj();
//        System.out.println(r);

//       int x= a.length();
//        System.out.println(x);

//       int r= a.login();
//        System.out.println(r);

       int s= a.value();
        System.out.println(s);

        String name = "Manotosh";
        String y = "Halder";
        String z = a.test( name, y );
        System.out.println(z);

    }


}

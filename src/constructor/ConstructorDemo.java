package constructor;

public class ConstructorDemo {

    ConstructorDemo(){
        System.out.println("Inside default constructor");
    }

    ConstructorDemo(int a){
        System.out.println("a : "+a);
    }

    ConstructorDemo(float a){
        System.out.println("float a : "+a);
    }

    public static void main(String[] args) {

        ConstructorDemo demo=new ConstructorDemo();

    }

}

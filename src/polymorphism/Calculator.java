package polymorphism;

public class Calculator {

    public Calculator(){

    }

    public int add(int a,int b){
     return (a+b);
    }

    int add(int a,int b,int c){
        return (a+b+c);
    }

    int sub(int a,int b,int c){
        return (a-b-c);
    }

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        System.out.println("addition : "+calculator.add(10,30));

    }
}

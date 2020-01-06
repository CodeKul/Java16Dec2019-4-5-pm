package inheritance;


import polymorphism.Calculator;

public class SingleInheritance extends Calculator {

    int sub(int a,int b){
        return (a-b);
    }

    public int add(int a,int b){
        return (a+b+10);
    }

    public static void main(String[] args) {
        SingleInheritance singleInheritance=new SingleInheritance();
        System.out.println(singleInheritance.sub(10,5));
        System.out.println(singleInheritance.add(10,5));
    }
}

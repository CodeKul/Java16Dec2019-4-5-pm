package keywords;

public class CheckSuperKey extends SuperKey {

    int a=20;

    void add(int a,int b){
        System.out.println(a+b);
    }

    void diplay(){
        System.out.println("a : "+super.a);
        super.add(10,20);

    }

    CheckSuperKey(){
        super();
        System.out.println("Child class constructor");

    }

    public static void main(String[] args) {
        CheckSuperKey checkSuperKey=new CheckSuperKey();
        checkSuperKey.diplay();
    }

}

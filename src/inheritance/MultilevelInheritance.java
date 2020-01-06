package inheritance;

public class MultilevelInheritance extends SingleInheritance {

    int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        MultilevelInheritance multilevelInheritance=new MultilevelInheritance();
        multilevelInheritance.mul(10,5);
    }
}

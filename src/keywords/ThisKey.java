package keywords;

public class ThisKey {

    private int a;
    private int b;
    private String name;

    ThisKey(int a,int b,String name){
        this();
        this.a=a;
        this.b=b;
        this.name=name;
    }

    ThisKey(){
        System.out.println("Inside default constructor.");
    }

    ThisKey(int a,int b){

    }

    private void display(){

        System.out.println("a : "+a+" b : "+b+" name : "+name);
    }

    private void getData(){
        this.display();
    }

    public static void main(String[] args) {
        ThisKey key=new ThisKey(10,20,"codekul");
        key.display();
    }


}

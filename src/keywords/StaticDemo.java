package keywords;

public class StaticDemo extends FinalKeyDemo{


   /* final int addition(int a,int b){
        return (a+b);
    }*/

    void showData(){
        System.out.println(count);
        System.out.println("inside show data");

    }

    static {
        System.out.println("Static block");
    }


   static void getData(){
        System.out.println("inside get data");

    }


    public static void main(String[] args) {
        StaticDemo demo=new StaticDemo();
        StaticDemo demo1=new StaticDemo();
        StaticDemo demo2=new StaticDemo();
        StaticDemo demo3=new StaticDemo();
        StaticDemo demo4=new StaticDemo();
        demo.showData();
        getData();
    }


             static int count=0;

            StaticDemo(){
                count++;
                System.out.println(count);
            }



}

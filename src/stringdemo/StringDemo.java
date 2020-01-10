package stringdemo;

public class StringDemo {

    public static void main(String[] args) {


        String a="Codekul";
        String b="Codekul";

        String c=new String("Codekul");

        System.out.println("address of a : "+a.hashCode());
        System.out.println("address of b : "+b.hashCode());

        if (a==b){
            System.out.println(true);
        }
        else
            System.out.println(false);

        System.out.println(System.currentTimeMillis());

    }



}

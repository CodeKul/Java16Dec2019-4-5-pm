package controlstatement;

public class ForLoop {


    private void forLoopDemo(){

        for (int i=0;i<3;i++){
            System.out.println();
            for (int j=0;j<3;j++) {
                System.out.print(i+""+j+"\t");
            }
        }


    }


    public static void main(String[] args) {

        new ForLoop().forLoopDemo();
        /*int a=10;
        int b=a++;//b=10 a=11
        int c=(++b)+(a++);//c=22 b=11 a=12
        int d=(c++)+(++b)+(a++);//d=46 c=23 b=12 a=13
        int e=(c--)+(--b)+(++a)+(d++);//e=94 d=47 c=22 b=11 a=14
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);*/

    }

}

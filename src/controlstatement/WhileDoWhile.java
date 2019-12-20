package controlstatement;

public class WhileDoWhile {

    void whileLoop(){

        int i=0;
        while (i<3){

            System.out.println("from while "+i);
            i++;
        }

        do {
            System.out.println("from do while "+i);
            i++;
        }while (i<3);


    }

    public static void main(String[] args) {
        new WhileDoWhile().whileLoop();
    }

}

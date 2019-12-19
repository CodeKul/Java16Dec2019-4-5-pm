package controlstatement;

import java.util.Scanner;

public class IfElseDemo {

    private void checkIfElse(int number){

        if(number%2==0){
            System.out.println(number+" Even Number");
        }
        else {
            System.out.println(number+" Odd Number");
        }

    }


    private void checkElseIf(int per){

        if (per<40){
            System.out.println("FAIL");
        }
        else if(per>=40 && per<60){
            System.out.println("Second class");
        }
        else if (per>=60 && per<75){
            System.out.println("First class");
        }
        else if (per>=75 && per<=100){
            System.out.println("Dist");
        }
        else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        new IfElseDemo().checkElseIf(scanner.nextInt());
    }

}

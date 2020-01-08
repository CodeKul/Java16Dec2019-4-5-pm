package controlstatement;


import java.util.Scanner;

public class SwitchCaseDemo {

    private void checkSwitchCase(){
        System.out.println("1. Add\n2. Sub\n3. Mul");
        System.out.print("Enter choice : ");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        System.out.print("Enter the values of a and b : ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        switch (choice){

            case 1 :
                System.out.println("Add : "+(a+b));
                break;

            case 2 :
                System.out.println("Sub : "+(a-b));
                break;

            case 3 :
                System.out.println("Mul : "+(a*b));
                break;

                default:
                    System.out.println("Invalid choice");
        }

    }

    public static void main(String[] args) {
                new SwitchCaseDemo().checkSwitchCase();
    }

}

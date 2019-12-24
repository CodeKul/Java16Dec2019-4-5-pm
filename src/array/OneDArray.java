package array;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {

        int array[]={1,2,3,4,5};

        int array1[]=new int[5];
/*      array1[0]=1;
        array1[1]=2;
        array1[2]=3;*/
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array1.length;i++){
            System.out.print("Enter value of array "+i+": ");
            array1[i]=scanner.nextInt();
        }

        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }


    }

}

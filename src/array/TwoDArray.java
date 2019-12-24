package array;

public class TwoDArray {

    public static void main(String[] args) {

        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for (int i=array.length-1;i>=0;i--){
            for (int j=array.length-1;j>=0;j--){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();

        }



    }

}


/*
 00 01 02
 10 11 12
 20 21 22

 1 2 3
 4 5 6
 7 8 9

 7 4 1
 8 5 2
 9 6 3

 3 2 1
 6 5 4
 9 8 7

 */

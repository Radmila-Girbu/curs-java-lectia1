package ucode.lectia2.squarenumbers;

public class SquareNumbers {
    public static void main(String[] args) {
      /*  int a = 2;
        int b = 5;*/


        SquareNumbers printer = new SquareNumbers();
//        printer.printSquareNumbersBetween( leftBoundary, rightBondary);
        for (int iterator = 2; iterator <= 5; iterator++) {
            System.out.print(iterator * iterator + " ");
        }


    }
}


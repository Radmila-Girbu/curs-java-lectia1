package ucode.lectia2.squarenumbers2;

public class SquareNumbers2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        SquareNumbers2 printer = new SquareNumbers2();
//        printer.printSquareNumbersBetween( leftBoundary, rightBondary);
        for (int iterator = a; iterator <= b; iterator++) {
            System.out.print(iterator * iterator + " ");
        }


    }
}

package Theater.PrimeNumbers;

public class Main2 {
    public static void main(String[] args) {
        int leftBoundary = 10;
        int rightBoundary = 29;
        PrimeNumbersPrinter printer = new PrimeNumbersPrinter();
        printer.printNumbersBetween(leftBoundary, rightBoundary);
    }
}


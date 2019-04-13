package ucode.lectia2.oddnumbers;

public class OddNumbers {
    public void printNumbersBetween(int leftBoundary, int rightBoundary) {
        for (int iterator = leftBoundary; iterator < rightBoundary; iterator++) {
            if (iterator % 2 == 1) {
                System.out.println("an odd number: " + iterator);

            }

        }
    }
}

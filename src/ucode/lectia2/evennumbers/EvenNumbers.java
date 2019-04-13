package ucode.lectia2.evennumbers;

public class EvenNumbers {

        public void printNumbersBetween(int leftBoundary, int rightBoundary) {
            for (int iterator = leftBoundary; iterator < rightBoundary; iterator++) {
                if (iterator % 2 == 0) {
                    System.out.println("an odd number: " + iterator);

                }

            }
        }
    }


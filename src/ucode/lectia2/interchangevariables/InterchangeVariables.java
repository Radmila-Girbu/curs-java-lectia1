package ucode.lectia2.interchangevariables;

public class InterchangeVariables {
    public static void main(String[] args) {

        for (int iterator1 = 1; iterator1 <= 5; iterator1++) {
            System.out.println();
            for (int iterator2 = 1 ; iterator2 <= iterator1; iterator2++) {
                System.out.print(iterator1 + " ");
            }
        }
    }
}

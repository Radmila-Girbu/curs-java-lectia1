package ucode.lectia2.formula;

public class Formula {
    public int getSumValue(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int getFormulaValue(int n){
        return n * (n - 1) / 2;
    }

    public void isEqual(int sumValue, int sumFormula){
        if (sumValue == sumFormula) {
            System.out.println("It works! " + sumValue + " " + sumFormula);
        } else {
            System.out.println("It is wrong! " + sumValue + " " + sumFormula);
        }
    }
    /*public void factorial(int n) {


        for (int i = 0; i < n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        if (sum == (n * (n - 1) / 2)) {
            System.out.println((n * (n - 1) / 2));
            System.out.println("It works");
        } else {
            System.out.println("It wrong");
        }

    }*/
}


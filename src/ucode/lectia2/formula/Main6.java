package ucode.lectia2.formula;

public class Main6 {
    public static void main(String[] args)
    {
        int n = 10;
        int sumValue;
        int formulaValue;

        Formula formula = new Formula();
        sumValue = formula.getSumValue(n);
        formulaValue = formula.getFormulaValue(n);
        formula.isEqual(sumValue, formulaValue);
    }
}

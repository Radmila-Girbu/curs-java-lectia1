package ucode.lectia2.operatorstesting;

public class OperatorsTesting {
    public static void main(String args[]) {
        OperatorsTesting testing = new OperatorsTesting();
        testing.isAddExample();
        testing.isMultiplicationExample();
        testing.isDivisionExample();
        testing.isModulusExample();
        testing.isComparingLesserExample();
        testing.isComparationGreaterExample();
        testing.isUnaryIncrementExample();
        testing.isInequalityExample();
        testing.isLogicalAndExample();
        testing.isOrExample();
        testing.isNotExample();
testing.Test();

    }

    public void isAddExample() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

    }

    public void isMultiplicationExample() {
        int a = 10;
        int b = 20;
        int result = a * b;
        System.out.println(result);
    }

    public void isDivisionExample() {
        float a = 40.6f;
        float b = 20.0f;
        float result = a / b;
        System.out.println(result);
    }

    public void isModulusExample() {
        int a = 60;
        int b = 20;
        int result = b % a;
        System.out.println(result);
    }

    public void isComparingLesserExample() {
        int a = 10;
        int b = 20;
        System.out.println(a < b);
    }

    public void isComparationGreaterExample() {
        int a = 10;
        int b = 20;

        System.out.println(a >= b);
    }

    public void isUnaryIncrementExample() {
        int a = 10;
        int b = 20;
        int c = b - ++a;
        System.out.println(c);
    }

    public void isInequalityExample() {
        int a = 10;
        int b = 20;

        System.out.println(a != b);
    }

    public void isLogicalAndExample() {
        int a = 10;
        int b = 20;
        int c = 60;

        System.out.println(a < b && b >= c);
    }

    public void isOrExample() {
        int a = 10;


        System.out.println(a <= 10 || a == 20);
    }

    public void isAndExample() {
        int a = 10;
        int b = 20;
        int c = 60;

        System.out.println(a < b && b >= c);
    }

    public void isNotExample() {
        int a = 10;
        int b = 20;
        int c = 60;

        System.out.println(!(a < b && b >= c));
    }
    public void Test(){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(++a + b++ * c);
    }
        /*int sum = testing.isAddExample(10, 28);

        testing.isProdusExample(10, 28);
    }

    public int isAddExample(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public void isProdusExample(int a, int b) {
        int prod = a * b;
        System.out.println(prod);*/
}


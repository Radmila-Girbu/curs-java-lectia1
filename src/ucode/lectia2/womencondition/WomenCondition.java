package ucode.lectia2.womencondition;

public class WomenCondition {
    public static void main(String args[]) {
        WomenCondition condition = new WomenCondition();
        condition.isFemaleLittle();
        condition.isComplexCondition();
    }

    public void isFemaleLittle() {
        int age = 31;
        int height = 140;
        int weight = 50;

        if (age > 90 || height < 145 && weight <= 45) {
            System.out.println("sufera de piticism");
        }
    }
    public void isComplexCondition(){

        int age = 31;
        int height = 165;
        int weight = 45;
        int bodyMassIndex = (weight / height * height);
        boolean isWhite = true;
        if (age > 25 && age < 40 && weight < 46 && height > 145 && bodyMassIndex < 30 && isWhite) {
            System.out.println(" caucazian sanatoasa");
        }
    }
}

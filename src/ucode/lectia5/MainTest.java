package ucode.lectia5;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        /*int suma, diferenta, inmultire;
        double impartire;
        Scanner calculator = new Scanner(System.in);
        System.out.println("Introduceti primul nr:");
        int nr1 = calculator.nextInt();
        System.out.println("Introduceti al doilea nr:");
        int nr2 = calculator.nextInt();
        suma = nr1 + nr2;
        diferenta = nr1 - nr2;
        inmultire = nr1 * nr2;
        impartire = (float) nr1 / nr2;
        System.out.println("Suma este: " + suma);
        System.out.println("Diferenta este: " + diferenta);
        System.out.println("Inmultirea este: " + inmultire);
        System.out.println("Impartirea este: " + impartire);
        Scanner exemplu = new Scanner(System.in);
        System.out.println("Introduceti un nr:");
        int luna=exemplu.nextInt();
        if (luna == 1) {
            System.out.println("Ianuarie");
        }else if(luna==2){
            System.out.println("Februarie");
        }else if(luna==3){
            System.out.println("Martie");
        }else if(luna==4){
            System.out.println("Aprilie");
        }else if(luna==5){
            System.out.println("Mai");
        }else if(luna==6){
            System.out.println("Iunie");
        }else if(luna==7){
            System.out.println("Iulie");
        }else{
            System.out.println("Numar invalid");
        }

        Scanner orar = new Scanner(System.in);
        System.out.println("1. Luni");
        System.out.println("2. Marti");
        System.out.println("3. Miercuri");
        System.out.println("4. Joi");
        System.out.println("5. Vineri");
        System.out.println("Introduceti cifra corespunzatoare zilei:");
        int ziua = orar.nextInt();

        switch (ziua) {
            case 1:
                System.out.println("Materie");
                System.out.println("1. Matematica");
                System.out.println("2. Limba romana");
                System.out.println("3. Educatia civica");
                break;
            case 2:
                System.out.println("Materie");
                System.out.println("1. Limba engleza");
                System.out.println("2. Limba germana");
                System.out.println("3. Educatia fizica");
                break;
            case 3:
                System.out.println("Materie");
                System.out.println("1. Matematica");
                System.out.println("2. Muzica");
                System.out.println("3. Religie");
            case 4:
                System.out.println("Materie");
                System.out.println("1. Dans");
                System.out.println("2. Limba romana");
                System.out.println("3. Matematica");
                break;
            case 5:
                System.out.println("Materie");
                System.out.println("1. Limba engleza");
                System.out.println("2. Matematica");
                System.out.println("3. Limba engleza");
                break;
            default:
                System.out.println("Numar invalid");


        }
        */
        MainXAnd0 xAnd0 = new MainXAnd0();
        Xand0Matrix theMatrix = new Xand0Matrix();
        //theMatrix.printMatrix();
        theMatrix.makeMove(1,      1, "X");
        theMatrix.makeMove(2, 1, "0");
        theMatrix.printMatrix();
        theMatrix.makeMove(1, 2, "X");
        theMatrix.makeMove(0, 1, "0");
        theMatrix.printMatrix();
        theMatrix.makeMove(1, 0, "X");
        theMatrix.makeMove(2, 1, "0");
        theMatrix.printMatrix();
    }
}





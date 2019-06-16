package ucode.lectia5;

import java.sql.SQLOutput;
import java.util.Scanner;


public class MainXAnd0 {
    public static void main(String[] args) {
        Xand0Matrix matrix = new Xand0Matrix();//initializarea obiectului
        matrix.printMatrix();

        Scanner scanner = new Scanner(System.in);//

        int scoreX = 0;
        int scoreY = 0;

        int line, column;
        boolean resultat;


        while (true) {
            System.out.println("The score is " + scoreX + " : " + scoreY);
            while (true) {
                System.out.println("Please enter the line: ");
                line = scanner.nextInt();
                if(line < 0 || line> 3) {
                    System.out.println("Oups! Please enter a number from 0 to 2");
                }
                System.out.println("Please enter the column: ");
                column = scanner.nextInt();
                if(column < 0 || column> 3) {
                    System.out.println("Oups! Please enter a number from 0 to 2");
                }
                System.out.println("Line: " + line + " column: " + column + " element " + matrix.getCurrentPlayerMark());

                resultat = matrix.makeMove(line, column);
                if (resultat) {
                    if (matrix.getCurrentPlayerMark().equals("x")) {
                        matrix.setCurrentPlayerMark("0");
                    } else {
                        matrix.setCurrentPlayerMark("x");
                    }
                    matrix.printMatrix();
                    if (matrix.isWinner("x")) {
                        System.out.println("Game over! X is a winner!");
                        scoreX++;
                        break;

                    }
                    if (matrix.isWinner("0")) {
                        System.out.println("Game over! 0 is a winner!");
                        scoreY++;
                        break;
                    }
                    if (matrix.isEquality()) {
                        System.out.println("Is equality!");
                        break;
                    }
                }

            }
            if (!(scoreX == 5 || scoreY == 5)) {
                matrix.clearMatrix();
                //  matrix.printMatrix();
            }
            if (scoreX == 5 || scoreY == 5) {

                break;
            }
            matrix.printMatrix();
        }

    }
}




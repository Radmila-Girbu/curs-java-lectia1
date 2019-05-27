package ucode.lectia5;

import java.util.Scanner;

public class MainXAnd0 {
    public static void main(String[] args) {
        Xand0Matrix matrix = new Xand0Matrix();
        Scanner scanner = new Scanner(System.in);
        matrix.printMatrix();

        boolean isXPlaying = true;
        while (true) {
            System.out.println("Please enter the line: ");
            int line = scanner.nextInt();
            System.out.println("Please enter the column: ");
            int column = scanner.nextInt();
            System.out.println("Please enter the element: ");
            String element = scanner.next();
            System.out.println("Line:" + " " + line + " " + "column:" + " " + column + " " + "element:" + " " + element);
            isXPlaying = !isXPlaying;
            if (element.equals("X") || element.equals("0")) {
                matrix.makeMove(line, column, element);
                matrix.printMatrix();
            }
            if (matrix.gameOver("x")) {
                System.out.println("A castigat X");
                break;
            }
            if (matrix.gameOver("0")) {
                System.out.println("A castigat 0");
                break;
            }

        }


        }
    }




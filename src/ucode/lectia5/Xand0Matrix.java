package ucode.lectia5;

public class Xand0Matrix {
    private String[][] matrix;
    private String currentPlayerMark;

    Xand0Matrix() {
        matrix = new String[3][3];
        currentPlayerMark = "x";

        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                matrix[lineIterator][columnIterator] = " ";
            }
        }
    }

    /*public String elementVerification(String element) {
     if (element == "x" || element == "0"){
         return "Thank You!";
    }else {
         return "Please enter X or 0";
     }
    */

    public void printMatrix() {
        System.out.println("_______________");

        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                System.out.print("| " + matrix[lineIterator][columnIterator] + " |");
            }
            System.out.println();
            System.out.println("_______________");

        }
    }

    public String makeMove(int line, int column, String element) {
        //matrix[line][column] = element;
        if (element == "0" || element == "X" || element == "x") {
            return matrix[line][column] = element;
        } else {
            System.out.println();
            System.out.println("Error! Please enter your symbol!");
            return matrix[line][column];
        }
    }


    public boolean gameOver(String element) {
        if ((matrix[0][0].equals("x") || matrix[0][0].equals("X")) && (matrix[1][1].equals("x") || (matrix[1][1].equals("X"))) && (matrix[2][2].equals("x") || (matrix[2][2].equals("X")))) {
            System.out.println("Game over! Player X wins!");
            return true;

        }
        if ((matrix[0][2].equals("x") || matrix[0][2].equals("X")) && (matrix[1][1].equals("x") || (matrix[1][1].equals("X"))) && (matrix[2][0].equals("x") || (matrix[2][0].equals("X")))) {
            System.out.println("Game over! Player X wins!");
            return true;
        }
        if ((matrix[0][0].equals("x") || matrix[0][0].equals("X")) && (matrix[0][1].equals("x") || (matrix[0][1].equals("X"))) && (matrix[0][2].equals("x") || (matrix[0][2].equals("X")))) {
            System.out.println("Game over! Player X wins!");
            return true;
        }
        if ((matrix[1][0].equals("x") || matrix[1][0].equals("X")) && (matrix[1][1].equals("x")) || (matrix[1][1].equals("X") && (matrix[1][2].equals("x") || (matrix[1][2].equals("X"))))) {
            System.out.println("Game over! Player X wins!");
            return true;
        }

        if ((matrix[2][0].equals("x") || matrix[2][0].equals("X")) && (matrix[2][1].equals("x")) || (matrix[2][1].equals("X") && (matrix[2][2].equals("x") || (matrix[2][2].equals("X"))))) {
            System.out.println("Game over! Player X wins!");
            return true;
        }
        if (matrix[0][0].equals("0") && matrix[1][1].equals("0") && matrix[2][2].equals("0")) {
            System.out.println("Game over! Player 0 wins!");
            return true;
        }
        if (matrix[0][2].equals("0") && matrix[1][1].equals("0") && matrix[2][0].equals("0")) {
            System.out.println("Game over! Player 0 wins!");
            return true;
        }
        if (matrix[0][0].equals("0") && matrix[0][1].equals("0") && matrix[0][2].equals("0")) {
            System.out.println("Game over! Player 0 wins!");
            return true;
        }
        if (matrix[1][0].equals("0") && matrix[1][1].equals("0") && matrix[1][2].equals("0")) {
            System.out.println("Game over! Player 0 wins!");
            return true;
        }

        if (matrix[2][0].equals("0") && matrix[2][1].equals("0") && matrix[2][2].equals("0")) {
            System.out.println("Game over! Player 0 wins!");
            return true;
        } else {
            return false;
        }
    }

    public void changePlayer() {
        if (currentPlayerMark == "x") {
            currentPlayerMark = "0";
        } else {
            currentPlayerMark = "x";
        }
    }

    public String elementVerification(String element) {
        if (element == "x" || element == "0") {
            return "Thank You!";
        } else {
            return "Please enter X or 0";
        }
    }

    public int score(int scoreX, int scoreY) {
        scoreX = 0;
        scoreY = 0;
        if (gameOver("x")) {
            System.out.println("X"+" " +scoreX++);
            return scoreX++;

        }
         if (gameOver("y")) {
             System.out.println("Y"+" " +scoreX++);
            return scoreY++;
        }else{
             return -1;
         }
    }
}










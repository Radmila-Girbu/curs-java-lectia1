package ucode.lectia5;

public class Xand0Matrix {
    private String[][] matrix;
    private String currentPlayerMark;
    private static final String EMPTY_SPACE = " ";

    // Initializarea unei matrice noi
    Xand0Matrix() {
        matrix = new String[3][3];// maticea contine 3 randuri si 3 coloane
        setCurrentPlayerMark("x");//prima miscare va fi intotdeauna facuta de jucatorul X
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                matrix[lineIterator][columnIterator] = EMPTY_SPACE;
            }
        }
    }

    // printarea matricei
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

    //verificarea si efectuarea miscarii, daca celula e libera returneaza adevarat, se acepta elementul
    public boolean makeMove(int line, int column) {
        if (matrix[line][column].equals(EMPTY_SPACE)) {
            matrix[line][column] = currentPlayerMark;
            return true;
        } else {
            return false;
        }
    }
/*
    //verificarea liniei introduse
    public boolean wrongLine() {

        if ( line < 0 || line > 2) {
             return true;
        }
        return false;
    }
    //verificarea coloanei
    public boolean wrongColumn(int column) {
        if (column < 0 || column > 2) {
            return true;
        }
        return false;
    }
*/
    //verificarea sfarsitului jocului si determinarea invingatorului
    public boolean isWinner(String element) {

        if (isPlayerOnDiagonalWinner(element)) {// conditia pentru sfarsitul partidei daca e o victorie pe linie
            return true;
        }

        if (isPlayerOnLineWinner(element)) {// conditia pentru sfarsitul partidei daca e o victorie pe linie
            return true;
        }
        if (isPlayerOnColumnWinner(element)) { // conditia de sfarsit de joc daca e victorie pe coloana
            return true;
        }
        return false;
    }

    private boolean isPlayerOnDiagonalWinner(String element) {// verificarea conditie de castig pe rand

        if (matrix[0][0].equals(element) && matrix[1][1].equals(element) && matrix[2][2].equals(element)) {//conditia pentru victorie pentru diag principala
            return true;
        }
        if (matrix[0][2].equals(element) && matrix[1][1].equals(element) && matrix[2][0].equals(element)) {//conditia pentru victorie pentru diag secundara
            return true;
        }
        return false;
    }

    private boolean isPlayerOnLineWinner(String player) {// verificarea conditie de castig pe rand
        //daca sunt 3 elemente de acelasi tip pe un rand,
        //elementul se declara castigator
        for (int lineNumber = 0; lineNumber <= 2; lineNumber++) {
            if (isLineWinner(lineNumber, player)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLineWinner(int lineNumber, String element) {
        return matrix[lineNumber][0].equals(element) && matrix[lineNumber][1].equals(element) && matrix[lineNumber][2].equals(element);
    }

    //daca sunt 3 elemente de acelasi tip in coloana,
    //elementul se declara castigator
    private boolean isPlayerOnColumnWinner(String player) {
        for (int columnNumber = 0; columnNumber <= 2; columnNumber++) {
            if (isColumnWinner(columnNumber, player)) {
                return true;
            }
        }
        return false;
    }

    private boolean isColumnWinner(int columnNumber, String element) {
        return matrix[0][columnNumber].equals(element) && matrix[1][columnNumber].equals(element) && matrix[2][columnNumber].equals(element);
    }

    // Se verifica conditia de egalitate
    //Daca exista o celula libera, nu este egalitate, returneaza fals
    public boolean isEquality() {
        for (int columnNumber = 0; columnNumber <= 2; columnNumber++) {
            for (int lineNumber = 0; lineNumber <= 2; lineNumber++) {
                if (matrix[lineNumber][columnNumber].equals(EMPTY_SPACE)) {
                    return false;
                }
            }
        }
        return true;
    }

    // printarea unei matrice curate, cu toate celulele goale
    public void clearMatrix() {
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                matrix[lineIterator][columnIterator] = EMPTY_SPACE;
            }
        }
    }

    //incapsularea variabilei de instanta
    public String getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    public void setCurrentPlayerMark(String currentPlayerMark) {
        this.currentPlayerMark = currentPlayerMark;
    }
}













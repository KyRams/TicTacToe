// Filename TicTacToe2.java
// Written by Kyle Ramsay
// Written on 15 Mar 2021

import javax.swing.JOptionPane;

public class TicTacToe2 {
    public static String[][] board = new String[][] { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
    public static int rounds = 0;
    public static boolean threeInRow = false;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to Tic-Tac-Toe.\nYou will have X and the computer will have O");
        while (rounds < 9 && threeInRow == false) {
            String playerPosition = playerPlay();
            replacePosition(playerPosition);
            checkRows();
            checkColumns();
            checkDiagonals();
            if (threeInRow == true) {
                JOptionPane.showMessageDialog(null,
                        "Player wins!\n" + board[0][0] + " " + board[0][1] + " " + board[0][2] + "\n" + board[1][0]
                                + " " + board[1][1] + " " + board[1][2] + "\n" + board[2][0] + " " + board[2][1] + " "
                                + board[2][2] + "\n");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Your move is recorded;\nnow the computer will play\n" + board[0][0] + " " + board[0][1] + " "
                                + board[0][2] + "\n" + board[1][0] + " " + board[1][1] + " " + board[1][2] + "\n"
                                + board[2][0] + " " + board[2][1] + " " + board[2][2] + "\n");
            }
            if (rounds < 9 && threeInRow == false) {
                String computerPosition = computerPosition();
                replaceComputerPosition(computerPosition);
                checkRows();
                checkColumns();
                checkDiagonals();
                if (threeInRow == true) {
                    JOptionPane.showMessageDialog(null,
                            "Computer wins!\n" + board[0][0] + " " + board[0][1] + " " + board[0][2] + "\n"
                                    + board[1][0] + " " + board[1][1] + " " + board[1][2] + "\n" + board[2][0] + " "
                                    + board[2][1] + " " + board[2][2] + "\n");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "The computer has played\n" + board[0][0] + " " + board[0][1] + " " + board[0][2] + "\n"
                                    + board[1][0] + " " + board[1][1] + " " + board[1][2] + "\n" + board[2][0] + " "
                                    + board[2][1] + " " + board[2][2] + "\n");
                }
            }
        }
        if (threeInRow == false) {
            JOptionPane.showMessageDialog(null, "It's a tie!");
        }
        JOptionPane.showMessageDialog(null, "Game over!");
        System.out.println();

    }

    public static String playerPlay() {
        String playerChoice = JOptionPane.showInputDialog("Enter the position where you want to play\n" + board[0][0]
                + " " + board[0][1] + " " + board[0][2] + "\n" + board[1][0] + " " + board[1][1] + " " + board[1][2]
                + "\n" + board[2][0] + " " + board[2][1] + " " + board[2][2] + "\n");
        return playerChoice;
    }

    public static void replacePosition(String playerPosition) {
        switch (playerPosition) {
        case "1":
            if (board[0][0].equals("X") || board[0][0].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[0][0] = "X";
                ++rounds;
            }
            break;
        case "2":
            if (board[0][1].equals("X") || board[0][1].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[0][1] = "X";
                ++rounds;
            }
            break;
        case "3":
            if (board[0][2].equals("X") || board[0][2].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[0][2] = "X";
                ++rounds;
            }
            break;
        case "4":
            if (board[1][0].equals("X") || board[1][0].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[1][0] = "X";
                ++rounds;
            }
            break;
        case "5":
            if (board[1][1].equals("X") || board[1][1].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[1][1] = "X";
                ++rounds;
            }
            break;
        case "6":
            if (board[1][2].equals("X") || board[1][2].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[1][2] = "X";
                ++rounds;
            }
            break;
        case "7":
            if (board[2][0].equals("X") || board[2][0].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[2][0] = "X";
                ++rounds;
            }
            break;
        case "8":
            if (board[2][1].equals("X") || board[2][1].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[2][1] = "X";
                ++rounds;
            }
            break;
        case "9":
            if (board[2][2].equals("X") || board[2][2].equals("O")) {
                playerPosition = playerPlay();
                replacePosition(playerPosition);
            } else {
                board[2][2] = "X";
                ++rounds;
            }
            break;
        default:
            playerPosition = playerPlay();
            replacePosition(playerPosition);
        }
    }

    public static void replaceComputerPosition(String playerPosition) {
        switch (playerPosition) {
        case "1":
            if (board[0][0].equals("X") || board[0][0].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[0][0] = "O";
                ++rounds;
            }
            break;
        case "2":
            if (board[0][1].equals("X") || board[0][1].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[0][1] = "O";
                ++rounds;
            }
            break;
        case "3":
            if (board[0][2].equals("X") || board[0][2].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[0][2] = "O";
                ++rounds;
            }
            break;
        case "4":
            if (board[1][0].equals("X") || board[1][0].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[1][0] = "O";
                ++rounds;
            }
            break;
        case "5":
            if (board[1][1].equals("X") || board[1][1].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[1][1] = "O";
                ++rounds;
            }
            break;
        case "6":
            if (board[1][2].equals("X") || board[1][2].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[1][2] = "O";
                ++rounds;
            }
            break;
        case "7":
            if (board[2][0].equals("X") || board[2][0].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[2][0] = "O";
                ++rounds;
            }
            break;
        case "8":
            if (board[2][1].equals("X") || board[2][1].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[2][1] = "O";
                ++rounds;
            }
            break;
        case "9":
            if (board[2][2].equals("X") || board[2][2].equals("O")) {
                playerPosition = computerPosition();
                replaceComputerPosition(playerPosition);
            } else {
                board[2][2] = "O";
                ++rounds;
            }
            break;
        }
    }

    public static String computerPosition() {
        int compPos = (int) (Math.random() * (9 - 1 + 1) + 1);
        // first row
        if (board[0][0].equals("O") && board[0][1].equals("O")) {
            compPos = 3;
        } else if (board[0][0].equals("O") && board[0][2].equals("O") && !board[0][1].equals("X")) {
            compPos = 2;
        } else if (board[0][1].equals("O") && board[0][2].equals("O") && !board[0][0].equals("X")) {
            compPos = 1;
            // second row
        } else if (board[1][0].equals("O") && board[1][1].equals("O") && !board[1][2].equals("X")) {
            compPos = 6;
        } else if (board[1][0].equals("O") && board[1][2].equals("O") && !board[1][1].equals("X")) {
            compPos = 5;
        } else if (board[1][1].equals("O") && board[1][2].equals("O") && !board[1][0].equals("X")) {
            compPos = 4;
            // third row
        } else if (board[2][0].equals("O") && board[2][1].equals("O") && !board[2][2].equals("X")) {
            compPos = 9;
        } else if (board[2][0].equals("O") && board[2][2].equals("O") && !board[2][1].equals("X")) {
            compPos = 8;
        } else if (board[2][1].equals("O") && board[2][2].equals("O") && !board[2][0].equals("X")) {
            compPos = 7;
            // first column
        } else if (board[0][0].equals("O") && board[1][0].equals("O") && !board[2][0].equals("X")) {
            compPos = 7;
        } else if (board[0][0].equals("O") && board[2][0].equals("O") && !board[1][0].equals("X")) {
            compPos = 4;
        } else if (board[1][0].equals("O") && board[2][0].equals("O") && !board[0][0].equals("X")) {
            compPos = 1;
            // second column
        } else if (board[0][1].equals("O") && board[1][1].equals("O") && !board[2][1].equals("X")) {
            compPos = 8;
        } else if (board[0][1].equals("O") && board[2][1].equals("O") && !board[1][1].equals("X")) {
            compPos = 5;
        } else if (board[1][1].equals("O") && board[2][1].equals("O") && !board[0][1].equals("X")) {
            compPos = 2;
            // third column
        } else if (board[0][2].equals("O") && board[1][2].equals("O") && !board[2][2].equals("X")) {
            compPos = 9;
        } else if (board[0][2].equals("O") && board[2][2].equals("O") && !board[1][2].equals("X")) {
            compPos = 6;
        } else if (board[1][2].equals("O") && board[2][2].equals("O") && !board[0][2].equals("X")) {
            compPos = 3;
            // diagonals
        } else if (board[2][0].equals("O") && board[1][1].equals("O") && !board[0][2].equals("X")) {
            compPos = 3;
        } else if (board[2][0].equals("O") && board[0][2].equals("O") && !board[1][1].equals("X")) {
            compPos = 5;
        } else if (board[0][2].equals("O") && board[2][0].equals("O") && !board[2][0].equals("X")) {
            compPos = 7;
        } else if (board[0][0].equals("O") && board[1][1].equals("O") && !board[2][2].equals("X")) {
            compPos = 9;
        } else if (board[0][0].equals("O") && board[2][2].equals("O") && !board[1][1].equals("X")) {
            compPos = 5;
        } else if (board[1][1].equals("O") && board[2][2].equals("O") && !board[0][0].equals("X")) {
            compPos = 1;
        }
        String computerPosition = (compPos + "");
        return computerPosition;
    }

    public static Boolean checkRows() {
        if ((board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X"))
                || (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a row!");
        } else if ((board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X"))
                || (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a row!");
        } else if ((board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
                || (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a row!");
        }
        return threeInRow;
    }

    public static Boolean checkColumns() {
        if ((board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X"))
                || (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a column!");
        } else if ((board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X"))
                || (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a column!");
        } else if ((board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X"))
                || (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three in a column!");
        }
        return threeInRow;
    }

    public static Boolean checkDiagonals() {
        if ((board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
                || (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three diagonally!");
        } else if ((board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("X"))
                || (board[2][0].equals("O") && board[1][1].equals("O") && board[0][2].equals("O"))) {
            threeInRow = true;
            JOptionPane.showMessageDialog(null, "Three diagonally!");
        }
        return threeInRow;
    }
}

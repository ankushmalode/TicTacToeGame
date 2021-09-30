package cpm.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;
        char player = 'X';

        //create 2 dimensional array for tic tac toe board
        char[][] board = new char[3][3];
        char ch = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ch++;
            }
        }
    }

}
package cpm.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int row, column;
        char player = 'X';
        board();
    }

        //create 1 dimensional array for tic tac toe board
    public static void board(){
        char[] board = new char[10];
//        char ch = '1';
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

}
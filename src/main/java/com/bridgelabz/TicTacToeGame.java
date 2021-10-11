package com.bridgelabz;

import java.util.*;

public class TicTacToeGame {
    static char[][] gameBoard = {{'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}};
    public static void main(String[] args) {

        printBoardGame(gameBoard);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the choise in between (1-9): ");
        int pos=scan.nextInt();
        System.out.println(pos);

        placePiece(gameBoard, pos, "player");
        printBoardGame(gameBoard);
    }

    public static void printBoardGame(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user){


        switch (pos){
            case 1:
                gameBoard[0][0]='x';
                break;
            case 2:
                gameBoard[0][2]='x';
                break;
            case 3:
                gameBoard[0][4]='x';
                break;
            case 4:
                gameBoard[2][0]='x';
                break;
            case 5:
                gameBoard[2][2]='x';
                break;
            case 6:
                gameBoard[2][4]='x';
                break;
            case 7:
                gameBoard[4][0]='x';
                break;
            case 8:
                gameBoard[4][2]='x';
                break;
            default:
                gameBoard[4][4]='x';
                break;
        }
    }

}
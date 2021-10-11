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

        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the choise in between (1-9): ");
            int pos=scan.nextInt();

            placePiece(gameBoard, pos, "player");
            Random random=new Random();
            int comp=random.nextInt(9)+1;
            placePiece(gameBoard, comp, "computer");
            printBoardGame(gameBoard);
        }
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
        char letter = ' ';
        if (user.equals("player"))
            letter='X';
        else if (user.equals("computer"))
            letter='O';
        switch (pos){
            case 1:
                gameBoard[0][0]=letter;
                break;
            case 2:
                gameBoard[0][2]=letter;
                break;
            case 3:
                gameBoard[0][4]=letter;
                break;
            case 4:
                gameBoard[2][0]=letter;
                break;
            case 5:
                gameBoard[2][2]=letter;
                break;
            case 6:
                gameBoard[2][4]=letter;
                break;
            case 7:
                gameBoard[4][0]=letter;
                break;
            case 8:
                gameBoard[4][2]=letter;
                break;
            default:
                gameBoard[4][4]=letter;
                break;
        }
    }

    public static String checkWinner(){
        List topRow= Arrays.asList(1,2,3);
        List midRow= Arrays.asList(4,5,6);
        List bottomRow= Arrays.asList(7,8,9);
        List leftCol= Arrays.asList(1,4,7);
        List midCol= Arrays.asList(2,5,8);
        List rightCol= Arrays.asList(3,6,9);
        List crossLine1= Arrays.asList(1,5,9);
        List crossLine2= Arrays.asList(3,5,7);

        return "";
    }

}
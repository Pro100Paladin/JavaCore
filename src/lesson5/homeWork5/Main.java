package lesson5.homeWork5;


import java.io.IOException;

import static lesson5.homeWork5.BackupFolder.createBackup;

public class Main {

    public static void main(String[] args) throws IOException {

//        String sourceDirectory = "./";
//        String backupDirectory = "./backup";
//        createBackup(sourceDirectory, backupDirectory);


        int[] initialState = {2, 1, 0, 2, 1, 2, 0, 1, 3};

        GameBoard gameBoard = new GameBoard(initialState);

        try {
            gameBoard.writeToFile("gameBoard.bin");
            gameBoard.readFromFile("gameBoard.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        gameBoard.printBoard();
    }

}


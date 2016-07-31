package tests;

import core.Board;

/**
 * Created by Andrew on 27/07/2016.
 */
public class TestBoard {
    public static void main(String[] args){
        Board board = new Board();

        board.printBoard();

        System.out.println();
        System.out.println();

        board.printBoardWithNames();
    }
}

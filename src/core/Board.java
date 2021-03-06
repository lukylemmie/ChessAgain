package core;

import core.Pieces.Piece;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrew on 26/07/2016.
 */
public class Board {
    public static final int DEFAULT_SIZE = 10;
    private Square topLeft;
    Map<String, Square> map = new HashMap<>();

    public Board(){
        Square[][] grid = new Square[DEFAULT_SIZE][DEFAULT_SIZE];

        for(int i = 0; i < DEFAULT_SIZE; i++){
            for(int j = 0; j < DEFAULT_SIZE; j++){
                String name = "";
                Boolean boardEdge = false;

                if(j == 0 || j == DEFAULT_SIZE - 1){
                    name += " ";
                    boardEdge = true;
                } else {
                    name += Character.toString(Character.toChars('a' + j - 1)[0]);
                }

                if(i == 0 || i == DEFAULT_SIZE - 1){
                    name += " ";
                    boardEdge = true;
                } else {
                    name += DEFAULT_SIZE - 1 - i;
                }

                Square square = new Square(name, boardEdge);
                grid[i][j] = square;
                if(!square.getBoardEdge()){
                    map.put(name, square);
                }
            }
        }

        for(int i = 0; i < DEFAULT_SIZE; i++){
            for(int j = 0; j < DEFAULT_SIZE; j++){
                Square up = null;
                Square down = null;
                Square left = null;
                Square right = null;
                if(i != 0){
                    up = grid[i - 1][j];
                }
                if(i != DEFAULT_SIZE - 1){
                    down = grid[i + 1][j];
                }
                if(j != 0){
                    left = grid[i][j - 1];
                }
                if(j != DEFAULT_SIZE - 1){
                    right = grid[i][j + 1];
                }
                grid[i][j].setAdjacent(up, down, left, right);
            }
        }

        topLeft = grid[0][0];
    }

    public void placePiece(String name, Piece piece){
        map.get(name).setPiece(piece);
    }

    public void printBoard(){
        topLeft.printBoard();
    }

    public void printBoardWithNames() {
        topLeft.printBoardWithNames();
    }
}

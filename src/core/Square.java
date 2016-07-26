package core;

import java.util.ArrayList;

/**
 * Created by Andrew on 26/07/2016.
 */
public class Square {
    private int colour = 0;
    private ArrayList<Square> adjacentSquares = new ArrayList<>();
    private Boolean boardEdge = false;
    private String name;
    private Boolean validMove = false;

    public Square(String name){
        this.name = name;
        // default square values
    }

    public Square(String name, ArrayList<Square> adjacentSquares){
        this.name = name;
        this.adjacentSquares = adjacentSquares;
    }

    public Square(Boolean boardEdge){

    }

    public void addAdjacent(Square square){
        adjacentSquares.add(square);
    }

    public void printBoard(){

    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public Boolean isBoardEdge() {
        return boardEdge;
    }

    public Boolean isValidMove() {
        return validMove;
    }

    public void setValidMove(Boolean validMove) {
        this.validMove = validMove;
    }

    @Override
    public String toString(){
        return name;
    }
}

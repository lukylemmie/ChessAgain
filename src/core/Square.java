package core;

import core.Pieces.Piece;

/**
 * Created by Andrew on 26/07/2016.
 */
public class Square {
    private int colour = 0;
    private Boolean boardEdge = false;
    private String name = null;
    private Boolean validMove = false;
    private Square up = null;
    private Square down = null;
    private Square left = null;
    private Square right= null;
    private Piece piece = null;

    public Square(String name){
        this.name = name;
        // default square values
    }

    public Square(String name, Boolean boardEdge){
        this.name = name;
        this.boardEdge = boardEdge;
    }

    public void setAdjacent(Square up, Square down, Square left, Square right){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void printBoard(){
        if(!boardEdge){
            if(piece == null){
                System.out.print("|  ");
            } else {
                piece.print();
            }
        } else {
            System.out.print("|" + name);
        }
        if(right != null){
            right.printBoard();
        } else {
            System.out.println("|");
        }
        if(left == null && down != null){
            down.printBoard();
        }
    }

    public void printBoardWithNames(){
        System.out.print("|" + name);

        if(right != null){
            right.printBoardWithNames();
        } else {
            System.out.println("|");
        }
        if(left == null && down != null){
            down.printBoardWithNames();
        }
    }

    public void clearValidMoves(){
        validMove = false;
        if(right != null){
            right.clearValidMoves();
        }
        if(left == null && down != null){
            down.clearValidMoves();
        }
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public Boolean getBoardEdge() {
        return boardEdge;
    }

    public String getName() {
        return name;
    }

    public Boolean getValidMove() {
        return validMove;
    }

    public void validMove(){
        validMove = true;
    }

    public void setValidMove(Boolean validMove) {
        this.validMove = validMove;
    }

    @Override
    public String toString(){
        return name;
    }

    public Square getUp() {
        return up;
    }

    public Square getDown() {
        return down;
    }

    public Square getLeft() {
        return left;
    }

    public Square getRight() {
        return right;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Boolean hasPiece(){
        return piece != null;
    }
}

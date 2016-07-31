package core.Pieces;

import core.Square;

import java.util.ArrayList;

/**
 * Created by Andrew on 26/07/2016.
 */
public abstract class Piece {
    public static final Character WHITE = 'w';
    public static final Character BLACK = 'b';

    private final Character colour;
    private final Character pieceId;
    private Square square;

    protected Piece(Character colour, Character pieceId) {
        this.colour = colour;
        this.pieceId = pieceId;
    }

    public void print() {
        System.out.print(colour.toString() + pieceId.toString());
    }

    public Square getSquare(){
        return square;
    }

    public abstract ArrayList<String> validMoves(Square start);
}

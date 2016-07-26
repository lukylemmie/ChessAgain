package core;

/**
 * Created by Andrew on 26/07/2016.
 */
public class Board {
    public static final int DEFAULT_SIZE = 8;
    private Square topLeft;

    public Board(){
        topLeft = createFirstRow();
    }

    private Square createFirstRow(){
        Square first = new Square("  ");
        return first;
    }

    private void createNextRow(Square square){

    }
}

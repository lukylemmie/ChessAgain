package tests;

import core.Square;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Andrew on 26/07/2016.
 */
public class addNullToArrayList {
    public static void main(String[] args){
        ArrayList<Square> squares = new ArrayList<>();

        squares.add(null);

        squares.add(new Square("a1"));

        System.out.println(squares);
    }
}

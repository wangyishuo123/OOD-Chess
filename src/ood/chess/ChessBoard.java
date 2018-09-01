package ood.chess;

import java.util.Stack;

public class ChessBoard {
    SmallSquare[][] smallSquare = new SmallSquare[8][8];

    Stack<ChessPieceState> history;

    public void move(ChessPieceState state){
        if(smallSquare[state.getNewX()][state.getNewY()].isAvailable()) {
           if(state.getPiece().isValidPosition(state.getCurrentX(), state.getCurrentY(), state.getNewX(), state.getNewY())) {
               state.getPiece().setPositionX(state.getNewX());
               state.getPiece().setPositionY(state.getNewY());
               recordHistory(state);

           }
        }

    }

    private void recordHistory(ChessPieceState state) {
       history.push(state);
    }

}

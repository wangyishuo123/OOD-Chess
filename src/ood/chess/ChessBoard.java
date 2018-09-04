package ood.chess;

import java.util.Stack;

public class ChessBoard {
    SmallSquare[][] smallSquare = new SmallSquare[8][8];

    Stack<ChessPieceState> history;

    public void move(ChessPieceState state){
           if(state.getPiece().isValidPosition(state.getCurrentX(), state.getCurrentY(), state.getNewX(), state.getNewY())) {
         //      state.getPiece().setPositionX(state.getNewX());
         //      state.getPiece().setPositionY(state.getNewY());
               if(smallSquare[state.getNewX()][state.getNewY()].isAvailable()) {
                   smallSquare[state.getNewX()][state.getNewY()].occupySqaure(state.getPiece());
               }
               else {
                   smallSquare[state.getNewX()][state.getNewY()].removePiece();
                   smallSquare[state.getNewX()][state.getNewY()].occupySqaure(state.getPiece());


               }
               recordHistory(state);


           }


    }

    private void recordHistory(ChessPieceState state) {
       history.push(state);
    }

}

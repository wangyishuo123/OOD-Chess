package ood.chess;

public class SmallSquare {
    public int X ;

    public int Y;
    ChessPiece piece;

    boolean isAvailable(){
        if(piece != null)
            return true;
        return false;
    }
}

package ood.chess;

public class ChessPieceState {
    ChessPiece piece;
    int currentX;
    int currentY;
    int newX;
    int newY;

    public ChessPiece getPiece() {
        return piece;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public int getNewX() {
        return newX;
    }

    public int getNewY() {
        return newY;
    }
}

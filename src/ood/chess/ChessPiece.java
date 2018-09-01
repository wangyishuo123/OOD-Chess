package ood.chess;

public class ChessPiece {
    ChessPieceType pieceType;
    ChessPieceColor pieceColor;
    int positionX;
    int PositionY;

    boolean isValidPosition(int currentX, int currentY, int newX, int newY){
        //some logic
        return true;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }
}

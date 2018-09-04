package ood.chess;

public class ChessPiece {
    private final ChessPieceType pieceType;
    private final ChessPieceColor pieceColor;

    public ChessPiece(ChessPieceType pieceType, ChessPieceColor pieceColor) {
        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    }


    boolean isValidPosition(int currentX, int currentY, int newX, int newY){
        //some logic
        if(this.pieceType == ChessPieceType.Bishop && newX - currentX == newY - currentY)
                return true;

        else if(this.pieceType == ChessPieceType.Knights){
            int x = Math.abs(currentX - newX);
            int y = Math.abs(currentY - newY);
            if (x * y == 2) {
                return true;
            } else {
                return false;
            }
        }

        else if(this.pieceType == ChessPieceType.Rooks && (newX == currentX || newY == currentY)){
            return true;
        }

        else if(this.pieceType == ChessPieceType.King){
            if(Math.sqrt(Math.pow(Math.abs((newX - currentX)),2)) + Math.pow(Math.abs((newY - currentY)), 2) == Math.sqrt(2))
                return true;
        }

        else if(this.pieceType == ChessPieceType.Queen ){
            if(newX - currentX == newY - currentY || newX == currentX || newY == currentY)
                return true;
        }

        return false;
    }


}

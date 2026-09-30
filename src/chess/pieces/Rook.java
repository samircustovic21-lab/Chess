package chess.pieces;

import chess.Board;
import chess.Piece;
import chess.Color;



public class Rook extends Piece {

    public Rook (Color color, int x, int y) {

        super (color, x, y);

    }

@Override
public boolean isValidMove(int newX, int newY, Board board) {
    

    // Utanför brädet
    if (newX < 0 || newX > 7 || newY < 0 || newY > 7) {
        return false;
    }

    // Måste röra sig horisontellt eller vertikalt
    if (newX != getX() && newY != getY()) {
        return false;
    }

    // Kontrollera vägen
    if (newX == getX()) {
        int direction = newY > getY() ? 1 : -1;

        for (int y = getY() + direction; y != newY; y += direction) {
            if (board.isOccupied(getX(), y)) {
                return false;
            }
        }
    } else {
        int direction = newX > getX() ? 1 : -1;

        for (int x = getX() + direction; x != newX; x += direction) {
            if (board.isOccupied(x, getY())) {
                return false;
            }
        }
    }

    


     // kontrollera vilken färg pjäsen som står i ankomstrutan har 
    // Kontrollera vilken färg pjäsen som står i ankomstrutan har
    if (board.isOccupied(newX, newY)) {
        if (board.getPiece(newX, newY).getColor() == this.getColor()) {
            return false;
        }else {
            return true;
        }
    }

    return true;

    }

}



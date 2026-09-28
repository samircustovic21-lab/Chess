package chess.pieces;

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
    if (newX != this.x && newY != this.y) {
        return false;
    }

    // Kontrollera vägen
    if (newX == this.x) {
        int direction = newY > this.y ? 1 : -1;

        for (int y = this.y + direction; y != newY; y += direction) {
            if (board.isOccupied(this.x, y)) {
                return false;
            }
        }
    } else {
        int direction = newX > this.x ? 1 : -1;

        for (int x = this.x + direction; x != newX; x += direction) {
            if (board.isOccupied(x, this.y)) {
                return false;
            }
        }
    }

    return true;
}

}
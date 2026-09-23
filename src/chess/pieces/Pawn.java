package chess.pieces;
import chess.Piece;
import chess.Color;

public class Pawn extends Piece {

    public Pawn (Color color, int x, int y) {

        super (color, x, y);

    }

    public int getMaxMove() {
        if (this.getColor() == Color.WHITE && this.getY() == 2) {
            return 2;
        } else if (this.getColor() == Color.BLACK && this.getY() == 7) {
            return 2;
        } else {
            return 1;
        }
    }

    public int getDirection() {
        if (this.getColor() == Color.WHITE) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean isValidMove(int newX, int newY) {
        int direction = this.getDirection();
        int maxMove = this.getMaxMove();
        int deltaX = newX - this.getX();
        int deltaY = newY - this.getY();

    
        if (Math.abs(deltaX) != 0 || Math.abs(deltaY) > maxMove) {
            return false;
        }

        
        if (deltaY * direction <= 0) {
            return false;
        }

            return true;
    }



    public boolean isValidMove (Board board, int newX, int newY) {

        int deltaX = newX - this.getX();
        int deltaY = newY - this.getY();

    // Måste gå framåt
        if (deltaY * this.getDirection() <= 0) {
            return false;
    }

    // Får inte gå mer än maxantalet steg
        if (Math.abs(deltaY) > this.getMaxMove()) {
            return false;
    }

    // Går rakt fram
        if (deltaX == 0) {

        // Det får inte finnas en pjäs framför
        if (board.isOccupied(newX, newY)) {
            return false;
        }

        // Om bonden går två steg måste rutan mellan vara tom
        if (Math.abs(deltaY) == 2) {
            int middleY = this.getY() + this.getDirection();

        if (board.isOccupied(this.getX(), middleY)) {
            return false;
            }
        }

        return true;
    }

    // Går diagonalt
        if (Math.abs(deltaX) == 1 && Math.abs(deltaY) == 1) {

        // Det måste finnas en pjäs att slå
        if (!board.isOccupied(newX, newY)) {
            return false;
        }

        // Det måste vara en motståndarpjäs
        if (board.getPiece(newX, newY).getColor() == this.getColor()) {
            return false;
        }

            return true;
        }

           
    }
}

import chess.Board;
import chess.Color;
import chess.pieces.Rook;

public class Test {

    public static void main(String[] args) {

    Board board = new Board();

    Rook rook = new Rook(Color.WHITE, 3, 3);
    board.placePiece(rook, 3, 3);

    Rook blocker = new Rook(Color.WHITE, 3, 5);
    board.placePiece(blocker, 3, 5);

    System.out.println(rook.isValidMove(3, 6, board));
    }
}


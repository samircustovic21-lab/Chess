import chess.Board;
import chess.Color;
import chess.pieces.Pawn;

public class TestPawn {

    public static void main(String[] args) {

        Board board = new Board();

        Pawn pawn = new Pawn(Color.WHITE, 4, 2);
        board.placePiece(pawn, 4, 2);

        System.out.println(pawn.isValidMove(board, 4, 3));
        System.out.println(pawn.isValidMove(board, 4, 4));
        System.out.println(pawn.isValidMove(board, 4, 5));
        System.out.println(pawn.isValidMove(board, 5, 3));
    }
}

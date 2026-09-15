    package chess;

    public class Board {

        private Piece [][] board;

        public Board() {
            board = new Piece [8][8];
    }

    public void placePiece (Piece piece, int x, int y) {
        board[x][y] = piece;
    }

}
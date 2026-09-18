    package chess;

    public class Board {

        private Piece [][] board;

        public Board() {
            board = new Piece [8][8];
    }

    public void placePiece (Piece piece, int x, int y) {
        board[x][y] = piece;
    }
    
    public Piece getPiece (int x, int y) {
            return board[x][y];
        }

        public void removePiece (int x, int y) {
            board[x][y] = null;
        }

        public boolean isOccupied (int x, int y) {
            return board[x][y] != null;
        }
    }

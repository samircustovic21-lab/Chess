package chess;

public class Piece {

    private Color color;
    private int x;
    private int y;

    public Piece (Color color, int x, int y) {
        this.color = color
        this.x = x
        this.y = y

    }

    public Color getColor () {
        return color;

    }


    public int getX () {
        return x;
    }

    public int getY () {

        return y;

    }
}
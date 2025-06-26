
public class Board {
    private Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
    }
    public Piece getPiece(int line, int column) {
    	return this.board[line][column];
    }
    public void setPiece(int line, int column, Piece piece) {
    	this.board[line][column] = piece;
    }
}

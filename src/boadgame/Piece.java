package boadgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	protected Board geBoard() {
		return board;
	}
	
	
}

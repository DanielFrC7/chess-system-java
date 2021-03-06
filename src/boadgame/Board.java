package boadgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int row, int column) {
		if (rows < 1 || columns<1) {
			throw new BoardException("Erro no tabuleiro");
		}
		this.rows = row;
		this.columns = column;
		pieces = new Piece[row][column];
	}
	public int getRow() {
		return rows;
	}
	public int getColumn() {
		return columns;
	}
	public Piece piece (int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Posi��o n�o no Tabuleiro");
		}
		return pieces[row][column];
	}
	public Piece piece (Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posi��o n�o no Tabuleiro");
		}
		return pieces [position.getRow()][position.getColumn()];
	}
	public void  placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("errou");
		}
		pieces[position.getRow()][position.getColumn()]=piece;
		piece.position = position;	
}
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >=0 && column < columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	public boolean thereIsAPiece(Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("errou");
		
	}return piece(position)!= null;
	}
	} 

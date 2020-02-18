package chess;

import boadgame.Board;
import boadgame.Position;
import chess.pieces.King;
import chess.pieces.Torre;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board (8,8);
		initialSetup();
	}
	public ChessPiece[][] getPiece(){
		ChessPiece[][] mat= new ChessPiece[board.getRow()][board.getColumn()];
		for (int i=0;i<board.getRow(); i++) {
			for(int j=0; j<board.getColumn(); j++){
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
	return mat;
	}
	private void initialSetup() {
		board.placePiece(new Torre(board, Color.WHITE), new Position (2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position (2, 1));
		board.placePiece(new King(board, Color.WHITE), new Position (0, 4));
	}
}

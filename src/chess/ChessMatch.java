package chess;

import boardgame.Board;

public class ChessMatch {

	// Atributos
	private Board board;
	
	// Metodos Especiais
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getColumns()];
		
		for (int i = 0; i < this.board.getRows(); i++) {
			for (int j = 0; j < this.board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) this.board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	// Metodos Especificos
	public ChessMatch() {
		super();
		this.board = new Board(8, 8);
	}
}

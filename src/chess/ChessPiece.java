package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	// Atributos
	private Color color;
	private int moveCount;
	
	// Metodos Especificos
	protected boolean isThereOpoponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != this.color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	public void increaseMoveCount() {
		this.moveCount++;
	}
	
	public void decreaseMoveCount() {
		this.moveCount--;
	}
	
	// Metodos Especiais
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return this.moveCount;
	}
}

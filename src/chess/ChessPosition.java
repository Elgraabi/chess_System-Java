package chess;

import boardgame.Position;

public class ChessPosition {
	
	// Atributos
	private char column;
	private int row;
	
	// Metodos Especificos
	protected Position toPosition() {
		return new Position(8 - this.row, this.column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + this.column + this.row;
	}
	
	// Metodos Especiais
	public ChessPosition(char column, int row) {
		super();
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Errore instatiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
}

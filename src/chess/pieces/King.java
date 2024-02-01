package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	// Atributos
	
	// Metodos Especificos
	@Override
	public String toString() {
		return "K";
	}
	
	// Metodos Especiais
	public King(Board board, Color color) {
		super(board, color);
	}

}

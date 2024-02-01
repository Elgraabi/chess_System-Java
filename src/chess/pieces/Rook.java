package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	// Atributos
	
	// Metodos Especificos
	@Override
	public String toString() {
		return "R";
	}
	
	// Metodos Especiais
	public Rook(Board board, Color color) {
		super(board, color);
	}

}

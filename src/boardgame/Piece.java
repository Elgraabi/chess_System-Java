package boardgame;

public class Piece {
	
	// Atributo
	protected Position position;
	private Board board;

	// Metodos Especificos
	
	
	// Metodos Especias
	public Piece(Board board) {
		super();
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}

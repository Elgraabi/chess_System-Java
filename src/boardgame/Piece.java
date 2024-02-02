package boardgame;

public abstract class Piece {
	
	// Atributo
	protected Position position;
	private Board board;

	// Metodos Especificos
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return this.possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean mat[][] = this.possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
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

package boardgame;

public class Board {
	
	// Atributos
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	// Metodos Especificos
	public Piece piece(int row, int columns) {
		return this.pieces[row][columns];
	}
	
	public Piece piece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	// Metodos Especiais
	public Board(Integer rows, Integer columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
}

package boardGame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int colunms) {
		if (rows < 1 || colunms < 1) {
			throw new BoardException("there must be at least one row and one column");
		}
		this.rows = rows;
		this.columns = colunms;
		this.pieces = new Piece[rows][colunms];
	}

	public int getRows() {
		return rows;
	}

	public int getColunm() {
		return columns;
	}

	public boolean positionExist(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExist(Position position) {
		return positionExist(position.getRow(), position.getCollumn());
	}

	public boolean thereIsAPicie(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("position not on board");
		}
		return piece(position) != null;
	}

	public Piece piece(int row, int column) {
		if (!positionExist(row, column)) {
			throw new BoardException("this position not existe on board");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("this position not existe on board");
		}
		return pieces[position.getRow()][position.getCollumn()];
	}

	public Piece Piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}

	public Piece placePiece(Piece piece, Position position) {
		if (thereIsAPicie(position)) {
			throw new BoardException("There is already a piece on position  ");

		}
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
		return null;

	}
}

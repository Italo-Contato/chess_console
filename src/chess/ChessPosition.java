package chess;

import boardGame.BoardException;
import boardGame.Position;

public class ChessPosition {
	private char column;
	private int rows;

	public ChessPosition(char column, int rows) {
		if (column < 'a' || column > 'h' || rows < 1 || rows > 8) {
			throw new BoardException("Erro instatiation chessPosition. Vali values from a1 to h8");
		}
		this.column = column;
		this.rows = rows;
	}

	public char getColumn() {
		return column;
	}

	public int getRows() {
		return rows;
	}

	protected Position toPosition() {
		return new Position(8 - rows, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getCollumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + rows;
	}

}

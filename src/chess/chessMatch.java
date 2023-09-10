package chess;

import boardGame.Board;

public class chessMatch {
	private Board board;

	public chessMatch() {
		board = new Board(8, 8);
	}

	public ChessPiece[][] getPiece() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColunm()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColunm(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;

	}

}

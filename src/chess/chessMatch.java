package chess;

import boardGame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class chessMatch {
	private Board board;

	public chessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColunm()];
		for (int i = 0; i < board.getColunm(); i++) {
			for (int j = 0; j < board.getColunm(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;

	}

	public void pleaceNewPiece(char column, int rows, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, rows).toPosition());
	}

	public void initialSetup() {
		pleaceNewPiece('e', 8, new King(board, Color.WHITE));
		pleaceNewPiece('b', 6, new Rook(board, Color.WHITE));
		pleaceNewPiece('e', 1, new King(board, Color.BLACK));
	}

}

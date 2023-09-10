package app;

import boardGame.Board;
import boardGame.Position;
import chess.chessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chessMatch chessMatch = new chessMatch();
		UI.printBoard(chessMatch.getPiece());
	}
}

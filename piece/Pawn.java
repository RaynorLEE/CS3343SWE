package piece;

import java.util.Scanner;

import chess.ChessBoard;

public class Pawn extends Piece{

	private boolean ifFirstMove;
	private boolean isPassant;
	
	public Pawn(boolean color, String id, int x, int y){
		setColor(color);
		setId(id);
		ifFirstMove = true;
		isPassant = false;
	}
	
	public boolean atBoundary(int x,int y){
			if(this.getColor())
				if(x == 7)
					return true;
			else
				if(x == 0)
					return true;
			return false;	
	}
	
	
	public boolean bepassant(){
		return isPassant;
	}
	public void changePassantToTrue(){
		isPassant=true;
	}
	public void changePassantToFalse(){
		isPassant=false;
	}
	public boolean ifFirstMove(){
		return ifFirstMove;
	}

	public String returnName(){
		return "Pawn";
	}

	
}

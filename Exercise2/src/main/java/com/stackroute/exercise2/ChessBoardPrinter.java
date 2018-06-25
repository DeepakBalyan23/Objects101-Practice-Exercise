package com.stackroute.exercise2;

public class ChessBoardPrinter {

	public void printChessBoard() {
		boolean isWhite = true;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(isWhite) {
					System.out.print("WW");
				} else {
					System.out.print("BB");
				}
				isWhite = !isWhite;
				System.out.print("|");
			}
			isWhite = !isWhite;
			System.out.println("");
		}
	}
}

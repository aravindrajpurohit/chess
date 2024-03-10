package model;

// Map possible moves to the following output:
// Input and Output Formats:
// Your program should accept as its input a board configuration that contains the position of white pieces, the position of black pieces, and the piece whose possible legal moves are to be computed.
// For example, the input for the above board configuration should look something like this:
// WHITE: Rf1, Kg1, Pf2, Ph2, Pg3 BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5 PIECE TO MOVE: Rf1
// Please note the use of the capital letters K, Q, R, B, N, and P to identify the King, Queen, Rook, Bishop, Knight, and Pawn respectively.
// Given the above input description, your program should produce the following output:
// LEGAL MOVES FOR Rf1: e1, d1, c1, b1, a1

public class BoardOffsetMapper {

   

    public void printLegalMovesForRook(int row, int column, int rOW2, int cOLUMN2) {
        // Legal moves for a Piece on a chessboard configuration should be Like for Piece followed by Column Name and Row Number
        // For example, the input for the above board configuration should look something like this:
        // WHITE: Rf1, Kg1, Pf2, Ph2, Pg3 BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5 PIECE TO MOVE: Rf1


        // Given the above input description, your program should produce the following output:
//Legal Moves for Piece should be like PD4, 

System.out.println("LEGAL MOVES FOR Piece" + " " +"Row 1" + row + " Row 2" + rOW2 + "Column 1" + column + " Column 2" + cOLUMN2 + ": ");
        

    }
    
}

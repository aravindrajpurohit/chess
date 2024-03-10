// Input and Output Formats:
// Your program should accept as its input a board configuration that contains the position of white pieces, the position of black pieces, and the piece whose possible legal moves are to be computed.
// For example, the input for the above board configuration should look something like this:
// WHITE: Rf1, Kg1, Pf2, Ph2, Pg3 BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5 PIECE TO MOVE: Rf1
// Please note the use of the capital letters K, Q, R, B, N, and P to identify the King, Queen, Rook, Bishop, Knight, and Pawn respectively.
// Given the above input description, your program should produce the following output:
// LEGAL MOVES FOR Rf1: e1, d1, c1, b1, a1
package model;

import java.awt.Color;
import java.util.Collection;
import javax.swing.ImageIcon;



public abstract class Piece {

    private final PieceType pieceType;
    private final PieceColor pieceColor;
    private Square square;
    private boolean moved;

    public Piece(PieceColor color, PieceType type) {
        pieceColor = color;
        pieceType = type;
        moved = false;
    }
    
    public PieceColor getPieceColor() {
        return pieceColor;
    }
    
    public void setMoved() {
        moved = true;
    }

    public boolean hasMoved() {
        return moved;
    }

    public int getTypeNumber() {
        return pieceType.getTypeNumber();
    }

    public String getColorString() {
        return pieceColor.toString();
    }

    public String getType() {
        return pieceType.toString();
    }

    public java.awt.Color getColor() {
        return pieceColor.getColor();
    }

    public Square getSquare() {
        return square;
    }

    public boolean isWhite() {
        return pieceColor.isWhite();
    }
    
    public Piece getOpponentKing() {
        return getSquare().getBoard().getOpponentKing(this);
    }

    public boolean isOpponent(Piece piece) {
        return piece != null && isWhite() != piece.isWhite();
    }

    public boolean legalMove(Square to) {
        return to.getPiece() == null || isOpponent(to.getPiece());
    }

    public abstract Collection<Square> getPossibleMoves();

    public abstract Collection<Square> generatePossibleMoves();

    public ImageIcon getIcon() {
        String path = "/resources/" + getColorString() + " " + getType().substring(0, 1) + ".png";
        return new ImageIcon(getClass().getResource(path));

    }

    public void putPieceOnSquareFirstTime(Square square) {
        this.square = square;
        this.square.setPiece(this);
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return pieceColor.toString().substring(0, 1) + " " + pieceType.toString().substring(0, 1);
    }

    public boolean isKing() {
        return this instanceof King;
    }

    // public void printPossibleMoves() {

    //     generatePossibleMoves();
    //     getPossibleMoves().stream().forEach((_item) -> {

    //         if (isOpponent(_item.getPiece())) {
    //             _item.setBackground(Color.RED);
    //         } else {
    //             _item.setBackground(Color.GREEN);
    //         }
    //         // var row = _item.getPiece().getSquare().ROW;
    //         // var column = _item.getPiece().getSquare().COLUMN;
    //         // System.out.print("LEGAL MOVES FOR " + getSquare().toString() + ": ");
    //         // var pieceType = _item.getPiece();
    //         var rOW2 = _item.ROW;
    //         var cOLUMN2 = _item.COLUMN;

            


    //         System.out.println("LEGAL MOVES FOR Piece " + pieceType + pieceColor + " " + " Row 2" + rOW2  + " Column 2" + cOLUMN2 + ": ");
      

            

    //     });
    // }

    public void printPossibleMoves() {
        // Assuming generatePossibleMoves updates the possible moves list
        generatePossibleMoves();
        StringBuilder moves = new StringBuilder("LEGAL MOVES FOR " + this.toString() + ": ");
        for (Square move : getPossibleMoves()) {
            // Convert column number to letter
            char columnLetter = (char) ('a' + move.COLUMN ); // Assuming COLUMN is 1-based index
            // Append this move to the moves string

            // If piece is white then the row number is 8 - ROW
            if (isWhite()) {

                moves.append(columnLetter).append(8- move.ROW).append(", ");
            } else {
                moves.append(columnLetter).append(8- move.ROW ).append(", ");
            }


        }
    
        // Remove the last comma and space if there are moves
        if (getPossibleMoves().size() > 0) {
            moves.setLength(moves.length() - 2); // Remove last ", "
        }
    
        System.out.println(moves.toString());
    }

}

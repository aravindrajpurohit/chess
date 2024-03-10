// The goal of this assignment is to give you the opportunity to work with tools that help us become more effective in uncovering software defects.
// For this assignment you will implement a move validation engine for the game of chess, use a static analysis tool to help you identify potential defects before you start testing, develop test cases for your program, and collect code coverage data to help you determine the adequacy of your testing effort.
// The purpose of the program that you will develop will be to compute all legal moves for a piece on a given chessboard configuration.
// For example, given the board configuration below, your program should compute that the Rook located on square f1 can legally move only to any of the following squares: e1, d1, c1, b1, a1.
 
// For a detailed description of all the legal chess moves please refer to
// https://en.wikipedia.org/wiki/Rules_of_chess
// Input and Output Formats:
// Your program should accept as its input a board configuration that contains the position of white pieces, the position of black pieces, and the piece whose possible legal moves are to be computed.
// For example, the input for the above board configuration should look something like this:
// WHITE: Rf1, Kg1, Pf2, Ph2, Pg3 BLACK: Kb8, Ne8, Pa7, Pb7, Pc7, Ra5 PIECE TO MOVE: Rf1
// Please note the use of the capital letters K, Q, R, B, N, and P to identify the King, Queen, Rook, Bishop, Knight, and Pawn respectively.
// Given the above input description, your program should produce the following output:
// LEGAL MOVES FOR Rf1: e1, d1, c1, b1, a1
// Deliverables
// Please submit the following items by Saturday, Macrh 9, 2024.
// • The source code for your program.
// • The set of test cases you used to ensure that your program satisfies
// its requirements. (Please provide a Readme file with instructions on how to exercise the tests, and any information regarding the status of the program, e.g., “The program does not work correctly under these conditions...”).
// • A report showing the results from using a static analysis tool and code improvements you made to address some (or all) of the issues reported.
// • A report showing the final code coverage achieved.
package control;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Board;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        JFrame frame = new JFrame("My chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(board);
        frame.setResizable(true);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}

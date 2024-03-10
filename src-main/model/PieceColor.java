package model;

import java.awt.Color;

public enum PieceColor {
    BLACK(Color.BLACK), WHITE(Color.WHITE);

    private final Color color;

    PieceColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean isWhite() {
        return this == WHITE;
    }

    public boolean isBlack() {
        return this == BLACK;
    }

    @Override
    public String toString() {
        return this == BLACK ? "Black" : "White";
    }
}

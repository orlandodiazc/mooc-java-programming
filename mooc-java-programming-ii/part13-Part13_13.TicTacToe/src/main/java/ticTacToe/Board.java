package ticTacToe;

import java.util.HashMap;

public class Board {

    private HashMap<String, Players> board;
    private Players turn;
    private boolean isOver;
    private static final String[][] WINNING_COMBINATIONS = {
        {"0", "1", "2"}, // Top row
        {"3", "4", "5"}, // Middle row
        {"6", "7", "8"}, // Bottom row
        {"0", "3", "6"}, // Left column
        {"1", "4", "7"}, // Middle column
        {"2", "5", "8"}, // Right column
        {"0", "4", "8"}, // Diagonal from top-left to bottom-right
        {"2", "4", "6"} // Diagonal from top-right to bottom-left
    };

    public Board() {
        board = new HashMap();
        turn = Players.X;
        isOver = false;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }

    public boolean getIsOver() {
        return isOver;
    }

    public Players setPlay(String index, Players player) {
        return board.putIfAbsent(index, player);
    }

    public Players getTurn() {
        return turn;
    }

    public Players toggleTurn() {
        if (turn == Players.X) {
            turn = Players.O;
        } else {
            turn = Players.X;
        }
        return turn;
    }

    public int getSize() {
        return board.size();
    }

    private Players getSymbol(String index) {
        return board.getOrDefault(index, null);
    }

    public boolean isWinner(Players player) {
        boolean result = false;
        for (int i = 0; i < WINNING_COMBINATIONS.length; i++) {
            int counter = 0;
            for (int j = 0; j < WINNING_COMBINATIONS[i].length; j++) {
                if (getSymbol(WINNING_COMBINATIONS[i][j]) != player) {
                    break;
                }
                counter++;
            }
            if (counter >= 3) {
                result = true;
                break;
            }
        }
        return result;
    }
}

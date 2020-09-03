package com.kenez92;

import java.util.List;

public class SudokuController {
    IO io = new IO();

    public SudokuBoard createSudokuBoard() {
        return new SudokuBoard(io.getSudokuSize());
    }

    public List<Integer> getPlayerMove(int boardSize) {
        return io.getPlayerMove(boardSize);
    }

    public void badPlayerMove() {
        io.badPlayerMove();
    }
}
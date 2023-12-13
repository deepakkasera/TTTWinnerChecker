package com.example.tttwinnercheckerstarter.strategies;

import com.example.tttwinnercheckerstarter.models.Board;
import com.example.tttwinnercheckerstarter.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}

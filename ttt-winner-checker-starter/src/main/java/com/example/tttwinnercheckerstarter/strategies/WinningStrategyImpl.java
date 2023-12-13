package com.example.tttwinnercheckerstarter.strategies;

import com.example.tttwinnercheckerstarter.models.Board;
import com.example.tttwinnercheckerstarter.models.Move;
import com.example.tttwinnercheckerstarter.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class WinningStrategyImpl implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        //Implement this method to check if the current move is winning move or not.
        return true;
    }
}

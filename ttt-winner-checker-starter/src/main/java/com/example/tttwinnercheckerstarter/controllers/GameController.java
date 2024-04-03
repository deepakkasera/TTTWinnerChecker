package com.example.tttwinnercheckerstarter.controllers;

import com.example.tttwinnercheckerstarter.exceptions.InvalidMoveException;
import com.example.tttwinnercheckerstarter.models.Game;
import com.example.tttwinnercheckerstarter.models.GameState;
import com.example.tttwinnercheckerstarter.models.Player;

import java.util.List;

public class GameControllers {
    public Game startGame(int dimension, List<Player> players) throws Exception {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public void displayBoard(Game game) {
        game.displayBoard(game.getBoard());
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        //Implement UNDO functionality
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }
}

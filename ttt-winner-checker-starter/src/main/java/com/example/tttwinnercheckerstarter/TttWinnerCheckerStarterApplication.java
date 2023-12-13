package com.example.tttwinnercheckerstarter;

import com.example.tttwinnercheckerstarter.controllers.GameController;
import com.example.tttwinnercheckerstarter.models.Game;
import com.example.tttwinnercheckerstarter.models.GameState;
import com.example.tttwinnercheckerstarter.models.Player;
import com.example.tttwinnercheckerstarter.models.Symbol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TttWinnerCheckerStarterApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TttWinnerCheckerStarterApplication.class, args);


    }
}

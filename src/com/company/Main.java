package com.company;

import controller.ScoreBoard;
import model.apple;
import model.banana;
import model.bomb;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Apple tap score = ");
        scoreBoard.algorithmBase = new apple();
        scoreBoard.showScore(10,5);

        System.out.print("Banana tap score = ");
        scoreBoard.algorithmBase = new banana();
        scoreBoard.showScore(10,5);

        System.out.print("Bomb tap score = ");
        scoreBoard.algorithmBase = new bomb();
        scoreBoard.showScore(10,5);
    }
}

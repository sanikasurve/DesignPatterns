package model;

import controller.ScoreAlgorithmBase;

public class bomb extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 5;
    }
}

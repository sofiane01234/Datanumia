package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;

import java.util.List;

public class SmallStraight implements YatzyStrategy {

    public static final List<Integer> SMALL_STRAIGHT = List.of(1, 2, 3, 4, 5);
    public static final int SMALL_STRAIGHT_SCORE = 15;

    @Override
    public int calculateScore(DiceRoll diceRoll) {
        return diceRoll.getDice().stream().sorted().toList().equals(SMALL_STRAIGHT) ? SMALL_STRAIGHT_SCORE : 0;
    }
}

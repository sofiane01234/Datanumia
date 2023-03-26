package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;
import java.util.List;

public class LargeStraight implements YatzyStrategy {

    public static final List<Integer> LARGE_STRAIGHT = List.of(2, 3, 4, 5, 6);

    private static final int LARGE_STRAIGHT_SCORE = 20;


    @Override
    public int calculateScore(DiceRoll diceRoll) {
        return diceRoll.getDice().stream().sorted().toList().equals(LARGE_STRAIGHT) ? LARGE_STRAIGHT_SCORE : 0;
    }
}

package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;

public class Yatzy implements YatzyStrategy {

    public static final int YATZY_SCORE = 50;

    @Override
    public int calculateScore(DiceRoll diceRoll) {
        return diceRoll.getDice().stream().distinct().count() <= 1 ? YATZY_SCORE: 0;
    }
}

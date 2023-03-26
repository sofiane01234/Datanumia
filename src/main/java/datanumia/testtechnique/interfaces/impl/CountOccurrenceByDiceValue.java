package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;

public class CountOccurrenceByDiceValue implements YatzyStrategy {

    private int diceValue;

    public CountOccurrenceByDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    @Override
    public int calculateScore(DiceRoll diceRoll) {
       return diceRoll.countOccurrenceByDiceValue(diceValue);
    }
}

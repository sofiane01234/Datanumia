package datanumia.testtechnique.interfaces.impl;


import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;

public class Chance implements YatzyStrategy {
    @Override
    public int calculateScore(DiceRoll diceRoll) {
        return diceRoll.sumOfAllDiceValues();
    }
}

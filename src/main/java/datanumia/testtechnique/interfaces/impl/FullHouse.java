package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;

public class FullHouse implements YatzyStrategy {
    @Override
    public int calculateScore(DiceRoll diceRoll) {
        boolean isThreeOfKind = !diceRoll.gettheHighestOccurenceEqualOrGreaterThen(3).isEmpty();
        boolean isYatzy = !diceRoll.gettheHighestOccurenceEqualOrGreaterThen(5).isEmpty();
        boolean isPair = !diceRoll.gettheHighestOccurenceEqualOrGreaterThen(2).isEmpty();

        return (!isYatzy && isPair && isThreeOfKind) ? diceRoll.sumOfAllDiceValues() : 0;
    }
}

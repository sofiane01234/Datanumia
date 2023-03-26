package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;
import java.util.List;

public class NofKind implements YatzyStrategy {

    private int diceValue;

    public NofKind(int diceValue) {
        this.diceValue = diceValue;
    }

    @Override
    public int calculateScore(DiceRoll diceRoll) {
        List<Integer> highestOccurenceEqualOrGreaterThen = diceRoll.gettheHighestOccurenceEqualOrGreaterThen(diceValue);
        return highestOccurenceEqualOrGreaterThen.isEmpty() ? 0 : highestOccurenceEqualOrGreaterThen.get(0) * diceValue;

    }
}

package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;
import java.util.List;

public class NofKind implements YatzyStrategy {

    private int diceWithSameValue;

    public NofKind(int diceWithSameValue) {
        this.diceWithSameValue = diceWithSameValue;
    }

    @Override
    public int calculateScore(DiceRoll diceRoll) {
        List<Integer> highestOccurenceEqualOrGreaterThen = diceRoll.gettheHighestOccurenceEqualOrGreaterThen(diceWithSameValue);
        return highestOccurenceEqualOrGreaterThen.isEmpty() ? 0 : highestOccurenceEqualOrGreaterThen.get(0) * diceWithSameValue;

    }
}

package datanumia.testtechnique.interfaces.impl;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.model.DiceRoll;
import java.util.List;

public class TwoPairs implements YatzyStrategy {
    @Override
    public int calculateScore(DiceRoll diceRoll) {
        List<Integer> highestOccurences = diceRoll.gettheHighestOccurenceEqualOrGreaterThen(2);
        return highestOccurences.size() >= 2 ? highestOccurences.stream().mapToInt(p -> p * 2).sum() : 0;
    }
}

package datanumia.testtechnique.enums;

import datanumia.testtechnique.interfaces.YatzyStrategy;
import datanumia.testtechnique.interfaces.impl.*;
import datanumia.testtechnique.model.DiceRoll;

public enum Category implements YatzyStrategy {

    CHANCE(new Chance()),
    YATZY(new Yatzy()),
    ONES(new CountOccurrenceByDiceValue(1)),
    TWOS(new CountOccurrenceByDiceValue(2)),
    THREES(new CountOccurrenceByDiceValue(3)),
    FOURS(new CountOccurrenceByDiceValue(4)),
    FIVES(new CountOccurrenceByDiceValue(5)),
    SIXES(new CountOccurrenceByDiceValue(6)),
    PAIR(new NofKind(2)),
    TWO_PAIRS(new TwoPairs()),
    THREE_OF_A_KIND(new NofKind(3)),
    FOUR_OF_A_KIND(new NofKind(4)),
    SMALL_STRAIGHT(new SmallStraight()),
    LARGE_STRAIGHT(new LargeStraight()),
    FULL_HOUSE(new FullHouse());

    private YatzyStrategy yatzyStrategy;

    Category(YatzyStrategy yatzyStrategy) {
        this.yatzyStrategy = yatzyStrategy;
    }

    public int calculateScore(DiceRoll diceRoll) {
        return yatzyStrategy.calculateScore(diceRoll);
    }
}

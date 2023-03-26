package datanumia.testtechnique;

import datanumia.testtechnique.model.DiceRoll;

import java.util.List;

public class YatzyScorer {

    public static final int YATZY_SCORE = 50;
    public static final int SMALL_STRAIGHT_SCORE = 15;
    private static final int LARGE_STRAIGHT_SCORE = 20;

    public static int scoreChance(DiceRoll diceRoll) {
        return diceRoll.sumOfAllDiceValues();
    }

    public static int scoreYatzy(DiceRoll diceRoll) {
        return !diceRoll.gettheHighestOccurenceEqualOrGreaterThen(5).isEmpty() ? YATZY_SCORE : 0;
    }

    public static int scoreOnes(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(1);
    }

    public static int scoreTwos(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(2);
    }

    public static int scoreThrees(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(3);
    }

    public static int scoreFours(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(4);
    }

    public static int scoreFives(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(5);
    }

    public static int scoreSixes(DiceRoll diceRoll) {
        return diceRoll.countOccurrenceForDiceNumber(6);
    }

    public static int scoreOnePair(DiceRoll diceRoll) {
        return diceRoll.gettheHighestOccurenceEqualOrGreaterThen(2).isEmpty() ? 0 : diceRoll.gettheHighestOccurenceEqualOrGreaterThen(2).get(0) * 2;
    }

    public static int scoreTwoPairs(DiceRoll diceRoll) {
        List<Integer> highestOccurences = diceRoll.gettheHighestOccurenceEqualOrGreaterThen(2);
        return highestOccurences.size() >= 2 ? highestOccurences.stream().mapToInt(p -> p * 2).sum() : 0;

    }

    public static int scoreThreeOfAKind(DiceRoll diceRoll) {
        return diceRoll.gettheHighestOccurenceEqualOrGreaterThen(3).get(0) * 3;
    }

    public static int scoreFourOfAKind(DiceRoll diceRoll) {
        return diceRoll.gettheHighestOccurenceEqualOrGreaterThen(4).get(0) * 4;

    }

    public static int scoreSmallStraight(DiceRoll diceRoll) {
        return diceRoll.isSmallStraight() ? SMALL_STRAIGHT_SCORE : 0;
    }

    public static int scoreLargeStraight(DiceRoll diceRoll) {
        return diceRoll.isLargeStraight() ? LARGE_STRAIGHT_SCORE : 0;
    }

    public static int scoreFullHouse(DiceRoll diceRoll) {
        return diceRoll.isFullHouse() ? diceRoll.sumOfAllDiceValues() : 0;
    }
}



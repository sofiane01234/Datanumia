package datanumia.testtechnique;

import datanumia.testtechnique.model.DiceRoll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class YatzyScorerTest {

    @ParameterizedTest
    @MethodSource("chanceScore")
    public void Should_Scores_The_Sum_Of_All_Dice(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreChance(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("yatzyScore")
    public void Should_Score_50_IfYatzy_And_Zero_Else(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreYatzy(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfOneDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_One(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreOnes(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfTwosDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Two(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreTwos(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfThreesDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Three(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreThrees(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfFourDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Four(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreFours(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfFiveDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Five(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreFives(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfSixDice")
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Six(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreSixes(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfTwoHighestMatchingDice")
    public void Should_Score_The_Sum_Of_The_Two_Highest_Matching_Dice(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreOnePair(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumOfMatchingDice")
    public void Should_Score_The_Sum_Of_The_Matching_Dice(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreTwoPairs(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumThreeDiceWithSameNumber")
    public void Should_Score_The_Sum_Of_Three_Dice_With_Same_Number(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreThreeOfAKind(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSumFourDiceWithSameNumber")
    public void Should_Score_The_Sum_Of_Four_Dice_With_Same_Number(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreFourOfAKind(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreSmallStraightScore")
    public void Should_Score_The_Sum_Of_All_Dice_When_Small_Straight(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreSmallStraight(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreLargeStraightScore")
    public void Should_Score_The_Sum_Of_All_Dice_When_Large_Straight(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreLargeStraight(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    @ParameterizedTest
    @MethodSource("scoreFullHouseScore")
    public void Should_Score_The_Sum_Of_All_Dice_When_Full_House(int d1, int d2, int d3, int d4, int d5, int expectedScore) {
        DiceRoll diceRoll = new DiceRoll(d1, d2, d3, d4, d5);
        int actualScore = YatzyScorer.scoreFullHouse(diceRoll);
        assertEquals(actualScore, expectedScore);
    }

    private static Stream<Arguments> chanceScore() {
        return Stream.of(
                Arguments.of(2, 3, 4, 5, 1, 15),
                Arguments.of(3, 3, 4, 5, 1, 16)
        );
    }

    private static Stream<Arguments> yatzyScore() {
        return Stream.of(
                Arguments.of(4, 4, 4, 4, 4, 50),
                Arguments.of(6, 6, 6, 6, 6, 50),
                Arguments.of(6, 6, 6, 6, 3, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfOneDice() {
        return Stream.of(
                Arguments.of(1, 2, 3, 4, 5, 1),
                Arguments.of(1, 2, 1, 4, 5, 2),
                Arguments.of(6, 2, 2, 4, 5, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfTwosDice() {
        return Stream.of(
                Arguments.of(1, 2, 3, 2, 6, 4),
                Arguments.of(2, 2, 2, 2, 2, 10)
        );
    }

    private static Stream<Arguments> scoreSumOfThreesDice() {
        return Stream.of(
                Arguments.of(1, 2, 3, 2, 3, 6),
                Arguments.of(2, 3, 3, 3, 3, 12),
                Arguments.of(2, 5, 4, 6, 1, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfFourDice() {
        return Stream.of(
                Arguments.of(4, 5, 5, 5, 5, 4),
                Arguments.of(4, 4, 5, 5, 5, 8),
                Arguments.of(4, 4, 4, 5, 5, 12),
                Arguments.of(5, 2, 3, 1, 5, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfFiveDice() {
        return Stream.of(
                Arguments.of(4, 4, 4, 5, 5, 10),
                Arguments.of(4, 4, 5, 5, 5, 15),
                Arguments.of(4, 5, 5, 5, 5, 20),
                Arguments.of(4, 3, 2, 6, 6, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfSixDice() {
        return Stream.of(
                Arguments.of(4, 4, 4, 5, 5, 0),
                Arguments.of(4, 4, 6, 5, 5, 6),
                Arguments.of(6, 5, 6, 6, 5, 18)
        );
    }

    private static Stream<Arguments> scoreSumOfTwoHighestMatchingDice() {
        return Stream.of(
                Arguments.of(5, 3, 6, 6, 5, 12),
                Arguments.of(5, 6, 6, 6, 5, 12),
                Arguments.of(3, 4, 3, 5, 6, 6),
                Arguments.of(5, 3, 3, 3, 5, 10),
                Arguments.of(2, 1, 3, 6, 5, 0)
        );
    }

    private static Stream<Arguments> scoreSumOfMatchingDice() {
        return Stream.of(
                Arguments.of(1, 2, 3, 1, 4, 0),
                Arguments.of(3, 3, 5, 4, 5, 16),
                Arguments.of(3, 3, 5, 5, 5, 16),
                Arguments.of(3, 3, 1, 3, 3, 0)
        );
    }

    private static Stream<Arguments> scoreSumThreeDiceWithSameNumber() {
        return Stream.of(
                Arguments.of(3, 3, 3, 3, 5, 9),
                Arguments.of(3, 3, 3, 4, 5, 9),
                Arguments.of(3, 3, 3, 3, 3, 9),
                Arguments.of(5, 3, 5, 4, 5, 15),
                Arguments.of(3, 5, 4, 3, 6, 0)
        );
    }

    private static Stream<Arguments> scoreSumFourDiceWithSameNumber() {
        return Stream.of(
                Arguments.of(3, 3, 3, 3, 5, 12),
                Arguments.of(5, 5, 5, 4, 5, 20),
                Arguments.of(5, 2, 2, 5, 5, 0),
                Arguments.of(5, 1, 4, 6, 3, 0)
        );
    }

    private static Stream<Arguments> scoreSmallStraightScore() {
        return Stream.of(
                Arguments.of(1, 2, 3, 4, 5, 15),
                Arguments.of(2, 3, 4, 5, 1, 15),
                Arguments.of(1, 2, 2, 4, 5, 0)
        );
    }


    private static Stream<Arguments> scoreLargeStraightScore() {
        return Stream.of(
                Arguments.of(6, 2, 3, 4, 5, 20),
                Arguments.of(2, 3, 4, 5, 6, 20),
                Arguments.of(1, 2, 2, 4, 5, 0)
        );
    }

    private static Stream<Arguments> scoreFullHouseScore() {
        return Stream.of(
                Arguments.of(6, 2, 2, 2, 6, 18),
                Arguments.of(2, 2, 3, 3, 4, 0),
                Arguments.of(4, 4, 4, 4, 4, 0)
        );
    }
}
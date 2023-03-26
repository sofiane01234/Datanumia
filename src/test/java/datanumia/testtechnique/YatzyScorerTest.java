package datanumia.testtechnique;

import datanumia.testtechnique.model.DiceRoll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyScorerTest {

    @Test
    public void Should_Scores_The_Sum_Of_All_Dice() {
        assertEquals(15, YatzyScorer.scoreChance(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(16, YatzyScorer.scoreChance(new DiceRoll(3, 3, 4, 5, 1)));
    }

    @Test
    public void Should_Score_50_IfYatzy_And_Zero_Else() {
        assertEquals(50, YatzyScorer.scoreYatzy(new DiceRoll(4, 4, 4, 4, 4)));
        assertEquals(50, YatzyScorer.scoreYatzy(new DiceRoll(6, 6, 6, 6, 6)));
        assertEquals(0, YatzyScorer.scoreYatzy(new DiceRoll(6, 6, 6, 6, 3)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_One() {
        assertEquals(1, YatzyScorer.scoreOnes(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(2, YatzyScorer.scoreOnes(new DiceRoll(1, 2, 1, 4, 5)));
        assertEquals(0, YatzyScorer.scoreOnes(new DiceRoll(6, 2, 2, 4, 5)));
        assertEquals(4, YatzyScorer.scoreOnes(new DiceRoll(1, 2, 1, 1, 1)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Two() {
        assertEquals(4, YatzyScorer.scoreTwos(new DiceRoll(1, 2, 3, 2, 6)));
        assertEquals(10, YatzyScorer.scoreTwos(new DiceRoll(2, 2, 2, 2, 2)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Three() {
        assertEquals(6, YatzyScorer.scoreThrees(new DiceRoll(1, 2, 3, 2, 3)));
        assertEquals(12, YatzyScorer.scoreThrees(new DiceRoll(2, 3, 3, 3, 3)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Four() {
        assertEquals(12, YatzyScorer.scoreFours(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(8, YatzyScorer.scoreFours(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(4, YatzyScorer.scoreFours(new DiceRoll(4, 5, 5, 5, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Five() {
        assertEquals(10, YatzyScorer.scoreFives(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(15, YatzyScorer.scoreFives(new DiceRoll(4, 4, 5, 5, 5)));
        assertEquals(20, YatzyScorer.scoreFives(new DiceRoll(4, 5, 5, 5, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Dice_That_Reads_Six() {
        assertEquals(0, YatzyScorer.scoreSixes(new DiceRoll(4, 4, 4, 5, 5)));
        assertEquals(6, YatzyScorer.scoreSixes(new DiceRoll(4, 4, 6, 5, 5)));
        assertEquals(18, YatzyScorer.scoreSixes(new DiceRoll(6, 5, 6, 6, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_The_Two_Highest_Matching_Dice() {
        assertEquals(6, YatzyScorer.scoreOnePair(new DiceRoll(3, 4, 3, 5, 6)));
        assertEquals(10, YatzyScorer.scoreOnePair(new DiceRoll(5, 3, 3, 3, 5)));
        assertEquals(12, YatzyScorer.scoreOnePair(new DiceRoll(5, 3, 6, 6, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_The_Matching_Dice() {
        assertEquals(16, YatzyScorer.scoreTwoPairs(new DiceRoll(3, 3, 5, 4, 5)));
        assertEquals(16, YatzyScorer.scoreTwoPairs(new DiceRoll(3, 3, 5, 5, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Three_Dice_With_Same_Number() {
        assertEquals(9, YatzyScorer.scoreThreeOfAKind(new DiceRoll(3, 3, 3, 4, 5)));
        assertEquals(15, YatzyScorer.scoreThreeOfAKind(new DiceRoll(5, 3, 5, 4, 5)));
        assertEquals(9, YatzyScorer.scoreThreeOfAKind(new DiceRoll(3, 3, 3, 3, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_Four_Dice_With_Same_Number() {
        assertEquals(12, YatzyScorer.scoreFourOfAKind(new DiceRoll(3, 3, 3, 3, 5)));
        assertEquals(20, YatzyScorer.scoreFourOfAKind(new DiceRoll(5, 5, 5, 4, 5)));
        assertEquals(12, YatzyScorer.scoreFourOfAKind(new DiceRoll(3, 3, 3, 3, 3)));
    }

    @Test
    public void Should_Score_The_Sum_Of_All_Dice_When_Small_Straight() {
        assertEquals(15, YatzyScorer.scoreSmallStraight(new DiceRoll(1, 2, 3, 4, 5)));
        assertEquals(15, YatzyScorer.scoreSmallStraight(new DiceRoll(2, 3, 4, 5, 1)));
        assertEquals(0, YatzyScorer.scoreSmallStraight(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_All_Dice_When_Large_Straight() {
        assertEquals(20, YatzyScorer.scoreLargeStraight(new DiceRoll(6, 2, 3, 4, 5)));
        assertEquals(20, YatzyScorer.scoreLargeStraight(new DiceRoll(2, 3, 4, 5, 6)));
        assertEquals(0, YatzyScorer.scoreLargeStraight(new DiceRoll(1, 2, 2, 4, 5)));
    }

    @Test
    public void Should_Score_The_Sum_Of_All_Dice_When_Full_House() {
        assertEquals(18, YatzyScorer.scoreFullHouse(new DiceRoll(6, 2, 2, 2, 6)));
        assertEquals(0, YatzyScorer.scoreFullHouse(new DiceRoll(2, 3, 4, 5, 6)));
    }
}
package datanumia.testtechnique.model;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DiceRoll {
    private final List<Integer> dice;
    public static final List<Integer> SMALL_STRAIGHT = List.of(1, 2, 3, 4, 5);
    public static final List<Integer> LARGE_STRAIGHT = List.of(2, 3, 4, 5, 6);

    public DiceRoll(int d1, int d2, int d3, int d4, int d5) {
        this.dice = List.of(d1, d2, d3, d4, d5);
    }

    public int countOccurrenceForDiceNumber(int diceNumber) {
        return dice.stream().filter(die -> die == diceNumber).reduce(0, Integer::sum);
    }

    public Map<Integer, Long> countOccurrenceByDice() {
        return dice.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
    }

    public int sumOfAllDiceValues() {
        return dice.stream().reduce(0, Integer::sum);
    }

    public List<Integer> gettheHighestOccurenceEqualOrGreaterThen(int n) {
        return countOccurrenceByDice().entrySet().stream().filter(e -> e.getValue() >= n).map(Map.Entry::getKey).sorted(Comparator.reverseOrder()).toList();
    }

    public boolean isSmallStraight() {
        return dice.stream().sorted().toList().equals(SMALL_STRAIGHT);
    }

    public boolean isLargeStraight() {
        return dice.stream().sorted().toList().equals(LARGE_STRAIGHT);
    }

    public boolean isFullHouse() {
        boolean isThreeOfKind = !gettheHighestOccurenceEqualOrGreaterThen(3).isEmpty();
        boolean isYatzy = !gettheHighestOccurenceEqualOrGreaterThen(5).isEmpty();
        boolean isPair = !gettheHighestOccurenceEqualOrGreaterThen(2).isEmpty();

        return !isYatzy && isPair && isThreeOfKind;
    }
}

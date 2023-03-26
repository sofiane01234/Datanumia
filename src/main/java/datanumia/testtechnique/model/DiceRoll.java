package datanumia.testtechnique.model;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DiceRoll {
    private final List<Integer> dice;

    public DiceRoll(int d1, int d2, int d3, int d4, int d5) {
        this.dice = List.of(d1, d2, d3, d4, d5);
    }

    public List<Integer> getDice() {
        return dice;
    }

    public int countOccurrenceByDiceValue(int diceNumber) {
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


}

package datanumia.testtechnique.services;

import datanumia.testtechnique.enums.Category;
import datanumia.testtechnique.model.DiceRoll;

public class YatzyService {

    public int calculateScore(DiceRoll diceRoll, Category category) {
        return category.calculateScore(diceRoll);
    }
}



package hangman.model;

public class BonusScore implements GameScore{

    /**
     * Calculates the final score in the BonusScore game based on the given parameters.
     *
     * @param count  The count of correct letters guessed.
     * @param incorrectCount   The count of incorrect letters guessed.
     * @return The calculated score according to the BonusScore rules.
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        int score = (count * 10) - (incorrectCount * 5);
        if (score < 0){
            return 0;
        }
        return score;
    }
}

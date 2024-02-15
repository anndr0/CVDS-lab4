package hangman.model;

public class OriginalScore implements GameScore{

    /**
     * Calculates the player's score in the OriginalScore game based on the given parameters.
     *
     * @param count  The count of correct letters guessed.
     * @param incorrectCount   The count of incorrect letters guessed.
     * @return The calculated score according to the OriginalScore rules.
     */

    @Override
    public int calculateScore(int count, int incorrectCount) {
        int score = 100 - (incorrectCount * 10);
        if (score < 0){
            return 0;
        } else {
            return score;
        }
    }
}

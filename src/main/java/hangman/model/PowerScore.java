package hangman.model;

public class PowerScore implements GameScore{
    /**
     * Calculates the player's score in the PowerScore game based on the given parameters.
     *
     * @param count  The count of correct letters guessed.
     * @param incorrectCount   The count of incorrect letters guessed.
     * @return The calculated score according to the PowerScore rules.
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        int score = (int) Math.pow(5, count) - (incorrectCount * 8);
        if(score > 500){
            return 500;
        } else if (score < 0){
            return 0;
        }
        return score;
    }
}

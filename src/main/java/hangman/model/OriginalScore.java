package hangman.model;

public class OriginalScore implements GameScore{
    /**
     * Returns the player's score
     * @param count
     * @param incorrectCount
     * @return score
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        return 0;
    }
}

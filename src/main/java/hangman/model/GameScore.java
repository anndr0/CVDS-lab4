package hangman.model;

public interface GameScore {
    /**
     * Returns the player's score
     * @param count
     * @param incorrectCount
     * @return score
     */
    public int calculateScore(int count, int incorrectCount);
}

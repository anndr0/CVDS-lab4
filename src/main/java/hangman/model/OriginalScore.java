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
        int score = 100 - (incorrectCount * 10);
        if (score < 0){
            return 0;
        }
        else{
            return score;
        }
    }
}

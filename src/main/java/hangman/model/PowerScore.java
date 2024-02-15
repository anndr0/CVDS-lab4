package hangman.model;

public class PowerScore implements GameScore{
    /**
     * Returns the player's score
     * @param count
     * @param incorrectCount
     * @return score
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        int score = (int) Math.pow(5, count) - (incorrectCount * 8);
        if(score > 500){
            return 500;
        }
        else if(score < 0){
            return 0;
        }
        return score;
    }
}

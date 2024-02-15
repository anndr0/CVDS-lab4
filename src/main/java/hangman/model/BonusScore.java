package hangman.model;

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int count, int incorrectCount) {
        int score = (count * 10) - (incorrectCount * 5);
        if (score < 0){
            return 0;
        }
        return score;

    }
}

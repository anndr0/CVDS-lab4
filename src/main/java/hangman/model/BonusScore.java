package hangman.model;

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int count, int incorrectCount) {
        return 0;
    }
}

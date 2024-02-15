package hangman;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*
    1 - Cantidad letras correctas mayor o igual a 0
        condicion frontera -1 y 0       
 
    2 - Cantidad letras incorrectas menor o igual a 0 
        condicion frontera
 */
public class GameScoreTest {

    /*
     * Pruebas OriginalScore
     */
    @Test
    public void originalMinimunScore(){
        OriginalScore game = new OriginalScore();
        assertEquals(game.calculateScore(0,10),0);
    }
    @Test
    public void originalMaximunScore(){
        OriginalScore game = new OriginalScore();
        assertEquals(game.calculateScore(3,0),100);
    }
    /*
     * Pruebas BonusScore
     */
    @Test
    public void bonusBonification(){
        BonusScore game = new BonusScore();
        assertEquals(game.calculateScore(6,0),60);
    }
    @Test
    public void bonusPenalization(){
        BonusScore game = new BonusScore();
        assertEquals(game.calculateScore(0,6),0);
    }
    /*
     * Pruebas PowerScore
     */
    @Test
    public void powerBonusMaximusScore(){
        PowerScore game= new PowerScore();
        assertEquals(game.calculateScore(4,0), 500);
     }

     @Test
    public void powerBonusMinimunScore(){
        PowerScore game= new PowerScore();
        assertEquals(game.calculateScore(2,4), 0);
    }
}

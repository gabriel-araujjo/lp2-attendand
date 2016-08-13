package br.ufrn.imd.lp2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gabriel on 8/13/16.
 */
public class QuestionTest {
    @Test
    public void Tokenization() throws Exception {
        // Assert the number of tokens in Question

        assertEquals(new Question(null).getTokens().size(), 0);
        assertEquals(new Question("").getTokens().size(), 0);
        assertEquals(new Question("azul").getTokens().size(), 1);
        assertEquals(new Question("azul ").getTokens().size(), 1);
        assertEquals(new Question("azul banana").getTokens().size(), 2);
        assertEquals(new Question("azul banana ").getTokens().size(), 2);
        assertEquals(new Question("azul  banana").getTokens().size(), 2);
    }

}
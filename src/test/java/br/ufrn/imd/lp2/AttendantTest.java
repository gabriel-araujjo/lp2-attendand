package br.ufrn.imd.lp2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gabriel on 8/13/16.
 */
public class AttendantTest {

    Attendant attendant = new Attendant();

    @Test
    public void reply() throws Exception {
        final String defaulAnswer = attendant.reply(null);

        // Assert the default answer in not null
        assertNotNull(defaulAnswer);

        // Assert a question with no token is replied with the default answer
        assertEquals(defaulAnswer, attendant.reply(new Question("")));

        // Assert a question with only one token, which is valid, is not replied with the default answer
        String answer = attendant.reply(new Question("azul"));
        assertNotEquals(answer, defaulAnswer);

        // Assert a question with at least one valid token is not replied with the default answer
        answer = attendant.reply(new Question("azul banana"));
        assertNotEquals(answer, defaulAnswer);
    }

}
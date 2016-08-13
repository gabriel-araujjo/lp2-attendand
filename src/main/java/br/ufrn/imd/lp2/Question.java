package br.ufrn.imd.lp2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * A question with some tokens
 */
class Question {

    private final Set<String> tokens;

    /**
     * The constructor
     * @param phrase some words
     */
    Question(String phrase) {
        tokens = new HashSet<>(tokenize(phrase));
    }

    /**
     * Generates tokens from a phrase
     * @param phrase the phrase (a not null string)
     * @return List of tokens
     */
    private List<String> tokenize(String phrase) {
        if (phrase == null) return Collections.emptyList();

        phrase = phrase.trim().toLowerCase();

        if (phrase.isEmpty()) return Collections.emptyList();;

        return Arrays.asList(phrase.split("\\s+"));
    }

    /**
     * Returns the tokens in this question
     * @return the tokens in this question
     */
    Set<String> getTokens() {
        return tokens;
    }

}

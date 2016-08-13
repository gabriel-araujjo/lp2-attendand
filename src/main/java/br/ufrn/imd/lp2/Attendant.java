package br.ufrn.imd.lp2;

import java.util.HashMap;
import java.util.Map;

/**
 * A dumb attendant
 */
class Attendant {

    /** What i know */
    private static final Map<String, String> FAQ;

    static {
        FAQ = new HashMap<>();
        FAQ.put("azul", "Reinicie o computador");
        FAQ.put("acessar", "Instale o Firefox");
        FAQ.put("dns", "Entre em contato com sua operadora de internet");
        FAQ.put(null, "Não entendi sua pergunta, por favor explique-me mais.");
    }

    /**
     * Ask me something through the method
     * @param question The question
     * @return Some reply
     */
    String reply(Question question) {
        if (question == null) return FAQ.get(null);
        for (String token : question.getTokens()) {
            if (FAQ.get(token) != null) {
                return FAQ.get(token);
            }
        }
        return FAQ.get(null);
    }
}

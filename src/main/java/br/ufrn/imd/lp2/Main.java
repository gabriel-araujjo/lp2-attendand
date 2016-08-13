package br.ufrn.imd.lp2;

import java.util.Scanner;

/**
 * The main class
 */
public class Main {

    private static final String EXIT_COMMAND = "y";

    private static final String PROMPT_STRING = "> ";

    private static void printUsage() {
        System.out.println("Pergunte alguma coisa para nosso robo atendente que ele responderá\n\n" +
                "Caso deseje sair digite \"y\".");
    }

    public static void main(String[] args) {
        printUsage();

        Scanner scanner = new Scanner(System.in);
        String userInput;
        Attendant attendant = new Attendant();

        do {
            System.out.print(PROMPT_STRING);
            userInput = scanner.nextLine();
            if (userInput.trim().toLowerCase().equals(EXIT_COMMAND)) {
                break;
            } else {
                String answer = attendant.reply(new Question(userInput));
                System.out.println(answer);
            }
        } while (true);

        System.out.println("Tchau, tchau!");
    }
}

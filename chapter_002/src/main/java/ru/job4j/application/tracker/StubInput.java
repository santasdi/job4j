package ru.job4j.application.tracker;

/**
 * Created by Артем on 02.10.2017.
 */
 public class StubInput implements Input {
    /**
     * Answers of user.
     */
    private String[] answers;
    /**
     * Possition of anwers in array.
      */
    private int position = 0;

    /**
     * Constructor for answers.
     * @param answers is anwers of user
     */
     public StubInput(String[] answers) {
         this.answers = answers;
     }

    /**
     * Asking override from Input.
     * @param question is question
     * @return is position of answer in array.
     */
    @Override
    public String ask(String question) {
        return answers[position++];
     }

    @Override
    public int ask(String question, int[] range) {
        return 0;
    }
}

package ru.job4j.application.tracker;



import java.util.List;

/**
 * Created by Артем on 02.10.2017.
 */
 public class StubInput implements Input {
    /**
     * Answers of user.
     */
    private List<String> answers;

    /**
     * Constructor for answers.
     * @param answers is anwers of user
     */
     public StubInput(List<String> answers) {
         this.answers = answers;
     }

    /**
     * Asking override from Input.
     * @param question is question
     * @param size
     * @return is position of answer in array.
     */
    @Override
    public String ask(String question, int size) {
        return question;
     }

    @Override
    public int ask(String question, List<UserAction> actions) {
        return 0;
    }
}

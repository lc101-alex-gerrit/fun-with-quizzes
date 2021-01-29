package org.launchcode.alexandgerrit.funwithquizzes;

public class TrueOrFalse extends Question {

    public TrueOrFalse (String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public boolean checkAnswer() {
        String userAnswer = getAnswerFromUser();
        if (userAnswer.equals(getCorrectAnswer())) {
            return true;
        }
        return false;
    }
}

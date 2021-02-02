package org.launchcode.alexandgerrit.funwithquizzes;

public class QuizRunner {
    public static void main(String[] args) {
        TrueOrFalse trueOrFalse = new TrueOrFalse("Is the sky blue?", "True");
        TrueOrFalse trueOrFalse2 = new TrueOrFalse("Do cats bark?", "False");

        Quiz quiz = new Quiz();

        quiz.addQuestion(trueOrFalse);
        quiz.addQuestion(trueOrFalse2);

        System.out.println(quiz.runQuiz());


    }
}

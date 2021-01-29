package org.launchcode.alexandgerrit.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private Scanner userInput;
    private String question;
    private String correctAnswer;
    private ArrayList<String> answersArray;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public abstract boolean checkAnswer();

    public String getAnswerFromUser() {
        System.out.println(this.question);
        userInput = new Scanner(System.in);
        String userAnswer = userInput.nextLine();
        userInput.close();
        return userAnswer;
    }

    public Scanner getUserInput() {
        return userInput;
    }

    public void setUserInput(Scanner userInput) {
        this.userInput = userInput;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setAnswersArray(ArrayList<String> answersArray) {
        this.answersArray = answersArray;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public ArrayList<String> getAnswersArray() {
        return answersArray;
    }
}

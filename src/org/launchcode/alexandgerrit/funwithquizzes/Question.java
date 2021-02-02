package org.launchcode.alexandgerrit.funwithquizzes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public abstract class Question {
    private Scanner userInput;
    private String question;
    private String correctAnswer;
    private ArrayList<String> answersArray;

    public Question(String question, String correctAnswer, ArrayList<String> answersArray) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answersArray = answersArray;
    }

    public boolean checkAnswer() {
        String userAnswer = getAnswerFromUser();
        if (userAnswer.toLowerCase().equals(getCorrectAnswer().toLowerCase())) {

            return true;
        }
        return false;
    }

    public String getAnswerFromUser() {
        System.out.println(this.question);
        System.out.println(answersArray);
        userInput = new Scanner(System.in);
        String userAnswer = userInput.nextLine();


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

package org.launchcode.alexandgerrit.funwithquizzes;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> list = new ArrayList<>();

    public void addQuestion(Question question) {
        list.add(question);
    }

    public ArrayList<Question> getList() {
        return list;
    }

    public int runQuiz() {
        int count = 0;
        for(Question question : list) {
            if (question.checkAnswer()) {
                count++;
            }
        }

        return count;
    }
}

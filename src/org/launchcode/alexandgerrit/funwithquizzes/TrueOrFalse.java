package org.launchcode.alexandgerrit.funwithquizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, String correctAnswer) {
        super(question, correctAnswer, new ArrayList<String>(Arrays.asList("True", "False")));
    }
}

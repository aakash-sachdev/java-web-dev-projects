package org.launchcode;

public abstract class Question {

    private String quizQuestion;

    public void displayQuestion(){
        System.out.println(quizQuestion);
    }

    public abstract boolean answer();
}

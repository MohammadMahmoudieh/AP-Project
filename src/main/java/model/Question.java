package model;

import java.util.ArrayList;

public class Question {
    String question,answer;
    protected static ArrayList<Question> questions = new ArrayList<>();
    public static Question getQuestionByNumber(){
        return null;//TODO: delete this code and write
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static ArrayList<Question> getQuestions() {
        return questions;
    }

}

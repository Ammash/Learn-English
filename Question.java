package com.words.english.english100;

import java.util.ArrayList;

public class Question {
    public String question ;
    public String chosen1 ;
    public String chosen2 ;
    public String chosen3 ;
    public String chosen4 ;
    public String chosenTrue ;

    public Question(String question, String chosen1, String chosen2, String chosen3, String chosen4, String chosenTrue) {
        this.question = question;
        this.chosen1 = chosen1;
        this.chosen2 = chosen2;
        this.chosen3 = chosen3;
        this.chosen4 = chosen4;
        this.chosenTrue = chosenTrue;
    }
    public  String chosen(String chosenTrue) {
        ArrayList<Question> arrayList = new ArrayList<Question>();
        arrayList.add(new Question ("who A","A","B","N","K","A"));
        if(arrayList.get(0).chosenTrue.equals(chosenTrue)){
            return "True";
        }else{
            return "False";
        }
    }
}

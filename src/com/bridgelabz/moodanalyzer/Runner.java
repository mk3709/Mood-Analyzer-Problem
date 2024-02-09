package com.bridgelabz.moodanalyzer;

public class Runner {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");

        try {
            String result = moodAnalyser.analyseMood();
            System.out.println(result);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError());
        }
    }
}

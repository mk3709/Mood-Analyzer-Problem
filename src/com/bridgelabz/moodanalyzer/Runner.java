package com.bridgelabz.moodanalyzer;

public class Runner {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am Happy");

        try {
            String result = moodAnalyser1.analyseMood();
            System.out.println(result);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError());
        }

        MoodAnalyser moodAnalyser2= new MoodAnalyser("I am Sad");
        try{
            String result = moodAnalyser2.analyseMood();
            System.out.println(result);
        }
        catch (MoodAnalysisException e)
        {
            System.out.println("Error:"+e.getError());
        }

        MoodAnalyser moodAnalyser3 = new MoodAnalyser("");
        try {
            String result = moodAnalyser3.analyseMood();
            System.out.println(result); // This block will be skipped due to the exception
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError().getErrorMessage()); // Output: Error: Mood cannot be empty
        }
    }
}

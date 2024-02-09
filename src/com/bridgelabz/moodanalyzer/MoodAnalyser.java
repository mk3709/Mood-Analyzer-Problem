package com.bridgelabz.moodanalyzer;


public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null || message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL_OR_EMPTY);
            }

            return message.toLowerCase().contains("sad") ? "SAD" : "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD, e);
        }
    }

    // Enum to differentiate MoodAnalysis errors
    public enum MoodAnalysisError {
        NULL_OR_EMPTY, INVALID_MOOD
    }
}




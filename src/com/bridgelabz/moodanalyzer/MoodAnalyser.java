package com.bridgelabz.moodanalyzer;
public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";}

    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
            }
            if(message.trim().isEmpty())
            {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
            }

            return message.toLowerCase().contains("sad") ? "SAD" : "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD, e);
        }
    }

    // Enum to differentiate MoodAnalysis errors
    public enum MoodAnalysisError {
        NULL_MOOD("Mood cannot be null"),
        EMPTY_MOOD("Mood cannot be empty"),
        INVALID_MOOD("Invalid Mood");

        private final String errorMessage;
        MoodAnalysisError(String errorMessage)
        {
            this.errorMessage=errorMessage;
        }
        public String getErrorMessage()
        {
            return  errorMessage;
        }
    }
}





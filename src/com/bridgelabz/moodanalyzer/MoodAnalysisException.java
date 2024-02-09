package com.bridgelabz.moodanalyzer;
public class MoodAnalysisException extends Exception {
    private final MoodAnalyser.MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalyser.MoodAnalysisError error) {
        super();
        this.error = error;
    }

    public MoodAnalysisException(MoodAnalyser.MoodAnalysisError error, Throwable cause) {
        super(cause);
        this.error = error;
    }

    public MoodAnalyser.MoodAnalysisError getError() {
        return error;
    }
}

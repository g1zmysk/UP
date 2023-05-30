package com.example.drondenchik;

public class Question {
    private int mTextresId;
    private boolean mAnswerTrue;

    public int getTextresId() {
        return mTextresId;
    }

    public void setTextresId(int textresId) {
        mTextresId = textresId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question (int textResId, boolean answerTrue) {
        mTextresId = textResId;
        mAnswerTrue = answerTrue;
    }
}

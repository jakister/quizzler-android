package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int mQuestionID;
    private boolean mRightAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mRightAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isRightAnswer() {
        return mRightAnswer;
    }

    public void setRightAnswer(boolean rightAnswer) {
        mRightAnswer = rightAnswer;
    }
}

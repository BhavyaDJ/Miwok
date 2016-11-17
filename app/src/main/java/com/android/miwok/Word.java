package com.android.miwok;

/**
 * Created by user on 17/11/16.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation){
        mDefaultTranslation =DefaultTranslation;
        mMiwokTranslation =MiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}

package com.example.android.mymiwok;

public class Word {
    private String mDefaulTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    ////////constructor///////
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefaulTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId)
    {
        mDefaulTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }
    public String getDefaulTranslation()
    {
        return mDefaulTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public int getAudioResourceId(){ return mAudioResourceId;}
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaulTranslation='" + mDefaulTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

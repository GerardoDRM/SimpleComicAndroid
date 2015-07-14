package doge.udlap.myapplication.model;

/**
 * Created by gerardo on 12/07/15.
 */
public class Page {
    private String mText;
    private int mImageId;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice c1, Choice c2) {
        mText = text;
        mImageId =  imageId;
        mChoice1 = c1;
        mChoice2 = c2;
    }

    public Page(int imageId, String text) {
        mText = text;
        mImageId =  imageId;
        mChoice1 = null;
        mChoice2 = null;
    }

    public boolean isFinal() {
        return mIsFinal;
    }


    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int id) {
        mImageId = id;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public Choice getmChoice2() {
        return mChoice2;
    }

    public void setmChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public Choice getmChoice1() {
        return mChoice1;
    }

    public void setmChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }
}


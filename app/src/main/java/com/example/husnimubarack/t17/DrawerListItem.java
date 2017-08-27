package com.example.husnimubarack.t17;

/**
 * Created by Husni Mubarack on 28-Aug-17.
 */

public class DrawerListItem {
    private int mImageId;
    private String mListItemName;

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmListItemName() {
        return mListItemName;
    }

    public void setmListItemName(String mListItemName) {
        this.mListItemName = mListItemName;
    }

    public DrawerListItem(int mImageId, String mListItemName) {
        this.mImageId = mImageId;
        this.mListItemName = mListItemName;
    }
}

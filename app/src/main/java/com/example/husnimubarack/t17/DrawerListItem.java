package com.example.husnimubarack.t17;

/**
 * Created by Husni Mubarack on 28-Aug-17.
 */

public class DrawerListItem {
    private int mImageId;
    private String mListItemName;
    private boolean HaveImage=false;

    public DrawerListItem(int ImageId, String ListItemName) {
        super();
        this.mImageId = ImageId;
        this.mListItemName = ListItemName;
        this.HaveImage=true;
    }

    public int getmImageId() {
        return mImageId;
    }


    public String getmListItemName() {
        return mListItemName;
    }


    public boolean isHaveImage() {
        return HaveImage;
    }
}

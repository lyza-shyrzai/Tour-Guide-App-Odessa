package com.s.liza.tourguideappodessa;


public class Info {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mName;
    private int mDesc;
    private int mAddress;
    private int mWorkHours;
    private int mTel;
    private int mSite;

    public Info(int imageResourceId, int name, int desc, int address, int workHours, int tel, int site) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDesc = desc;
        mAddress = address;
        mWorkHours = workHours;
        mTel = tel;
        mSite = site;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDesc() {
        return mDesc;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getWorkHours() {
        return mWorkHours;
    }

    public int getTel() {
        return mTel;
    }

    public int getSite() {
        return mSite;
    }
}

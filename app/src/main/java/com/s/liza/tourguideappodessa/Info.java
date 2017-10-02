package com.s.liza.tourguideappodessa;


public class Info {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mName;
    private String mDesc;
    private String mAddress;
    private String mWorkHours;
    private String mTel;
    private String mSite;

    public Info(int imageResourceId, String name, String desc, String address, String workHours, String tel, String site) {
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

    public String getName() {
        return mName;
    }

    public String getDesc() {
        return mDesc;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getWorkHours() {
        return mWorkHours;
    }

    public String getTel() {
        return mTel;
    }

    public String getSite() {
        return mSite;
    }
}

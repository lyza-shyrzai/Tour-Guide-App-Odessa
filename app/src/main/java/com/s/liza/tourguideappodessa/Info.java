package com.s.liza.tourguideappodessa;


public class Info {
    private String mName;
    private String mDesc;
    private String mAddress;
    private String mWorkHours;
    private String mTel;
    private String mSite;

    public Info(String name, String desc, String address, String workHours, String tel, String site) {
        mName = name;
        mDesc = desc;
        mAddress = address;
        mWorkHours = workHours;
        mTel = tel;
        mSite = site;
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

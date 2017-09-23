package com.s.liza.tourguideappodessa;


public class TextInfo {
    private String mName;
    private String mDesc;
    private String mAddress;
    private String mWorkHours;
    private String mTel;

    public TextInfo(String name, String desc, String address, String workHours, String tel) {
        mName = name;
        mDesc = desc;
        mAddress = address;
        mWorkHours = workHours;
        mTel = tel;
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
}

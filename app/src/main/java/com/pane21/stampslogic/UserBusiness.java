package com.pane21.stampslogic;

public class UserBusiness {
    private String name;
    private String address;
    private String key;
    private String picUrl;
    private String stampQty;
    private String colorKey;
    private String promoQty;

    public UserBusiness() {
    }

    public UserBusiness(String name, String address, String key, String picUrl, String stampQty, String colorKey, String promoQty) {
        this.name = name;
        this.address = address;
        this.key = key;
        this.picUrl = picUrl;
        this.stampQty = stampQty;
        this.colorKey = colorKey;
        this.promoQty = promoQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getStampQty() {
        return stampQty;
    }

    public void setStampQty(String stampQty) {
        this.stampQty = stampQty;
    }

    public String getColorKey() {
        return colorKey;
    }

    public void setColorKey(String colorKey) {
        this.colorKey = colorKey;
    }

    public String getPromoQty() {
        return promoQty;
    }

    public void setPromoQty(String promoQty) {
        this.promoQty = promoQty;
    }
}

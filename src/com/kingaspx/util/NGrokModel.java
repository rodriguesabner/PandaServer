package com.kingaspx.util;

public class NGrokModel {

    String public_url, proto;

    public NGrokModel() {
    }

    public NGrokModel(String public_url, String proto) {
        this.public_url = public_url;
        this.proto = proto;
    }

    public String getPublic_url() {
        return public_url;
    }

    public void setPublic_url(String public_url) {
        this.public_url = public_url;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

}

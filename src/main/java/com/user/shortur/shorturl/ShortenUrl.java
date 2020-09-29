package com.user.shortur.shorturl;

public class ShortenUrl {

    private String full_url;
    private String short_url;
    private String custome_url;

    public String getFull_url() {
        return full_url;
    }

    public void setFull_url(String full_url) {
        this.full_url = full_url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
   }

    public String getCustome_url() {
        return custome_url;
    }

    public void setCustome_url(String custome_url) {
        this.custome_url = custome_url;
    }
}

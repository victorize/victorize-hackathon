package com.noirdev.austin.the3dease;

/**
 * Created by Austin on 2/20/2016.
 */
public class Item {
    private String title;
    private String desc;
    private String img;
    private String url;

    public Item(){

    }

    public Item(String title, String desc, String img, String url){
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.url = url;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
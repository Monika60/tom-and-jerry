package com.a.com.class12;

public class Cartoon {
    private String name;
    private String about;
    private int image;

    public Cartoon(String name, String about, int image) {
        this.name = name;
        this.about = about;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

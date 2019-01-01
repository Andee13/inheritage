package com.vacik.andee;

public abstract class Hobby {
    String title;
    int hours;
    Hobby(String title, int hours){
        this.title = title;
        this.hours = hours;
    }
    public abstract void tellAboutHobby();
}

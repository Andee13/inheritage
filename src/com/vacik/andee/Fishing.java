package com.vacik.andee;

public class Fishing extends Hobby {
    int numberOfFish;

    Fishing(String title, int hours, int numberOfFish){
        super(title, hours);
        this.numberOfFish = numberOfFish;
    }
    public void get(){
        System.out.println("dalflkf");
    }
    @Override
    public void tellAboutHobby() {
        System.out.println("Fishing - " +
                "numberOfFish=" + numberOfFish +
                ", title='" + title + '\'' +
                ", hours=" + hours +
                ' ');
    }
}

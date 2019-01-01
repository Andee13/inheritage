package com.vacik.andee;

public class Reading extends Hobby {
    int numberOfBooks;

    Reading(String title, int hours, int numberOfBooks){
        super(title, hours);
        this.numberOfBooks = numberOfBooks;
    }

    public void tellAboutHobby() {
        System.out.println("Reading - " +
                "numberOfBooks=" + numberOfBooks +
                ", title='" + title + '\'' +
                ", hours=" + hours +
                ' ');
    }
}

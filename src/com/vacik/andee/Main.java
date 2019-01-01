package com.vacik.andee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hobby hobbies[] = new Hobby[4];
        hobbies[0] = new Reading("read war and peace", 8, 3);
        hobbies[1] = new Reading("fantastic book", 7, 2);
        hobbies[2] = new Fishing("fishing with friends ", 2, 10);
        hobbies[3] = new Fishing("sunday fishing",3,13 );
        for(Hobby a: hobbies) {

            a.tellAboutHobby();
        }
        System.out.println(hobbies[3] instanceof Hobby);
        //(/*(Fishing)*/hobbies[3]).get();
        List t = new ArrayList();
        
    }
}


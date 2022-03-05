//Ilia Safarian, student num: 40012341054047//
package com.ilia;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lessons univer = new Lessons();

        Scanner myLesson = new Scanner(System.in);

        String lesson = myLesson.nextLine();


        switch (lesson){
            case "general mathematics 1":
                univer.math1();
                break;
            case "general mathematics 2":
                univer.math2();
                break;
            case "physical education 1":
                univer.phys1();
                break;
            case "physical education 2":
                univer.phys2();
                break;
            case "general english":
                univer.ge();
                break;
            case "general persian":
                univer.gp();
                break;
            case "computer basics":
                univer.cb();
                break;
            case "specialized language":
                univer.sl();
                break;
            case "differential equations":
                univer.de();
                break;
            case "discrete mathematics":
                univer.dm();
                break;
            case "advanced programing":
                univer.ap1();
                break;
            case "computer basics lab":
                univer.cbl();
                break;
            case "data structures":
                univer.ds();
                break;
            case "logic circuits":
                univer.lc();
                break;
            case "electronic circuits":
                univer.ec();
                break;
            case "engineering mathematics":
                univer.em();
                break;
            case "theory of languages and machines":
                univer.tlm();
                break;
            case "computer architecture":
                univer.ca1();
                break;
            case "designing algorithms":
                univer.da();
                break;
            case "data storage and retrieve":
                univer.dsr();
                break;
            case "engineering probability and statistics":
                univer.eps();
        }

    }
}

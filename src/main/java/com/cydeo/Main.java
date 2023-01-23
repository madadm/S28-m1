package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDoubled(items);


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team team = new Team("Liverpool");

        team.addPlayer(joe);
        team.addPlayer(pat);
        team.addPlayer(beckham);

    }

    private static void printDoubled(ArrayList<Integer> items) {

        for (int each : items) {
            System.out.println( each*2);
        }
    }
}
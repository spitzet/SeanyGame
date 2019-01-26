package com.seanmcdonough;

import java.util.Scanner;

public class Game {
    private GameWorld gw;

    public Game(){
        this.gw = new GameWorld();
        play();
    }

    private void play(){
        System.out.println("Game starting!");
        while(this.gw.getLives() > 0) {
            getCommand();
        }

    }

    private char getCommand(){
        Scanner s = new Scanner(System.in);

        char input = s.next().charAt(0);
        switch(input){
            case 'n':
                //change heading to north
                gw.steerNorth();
                break;
            case 's':
                //change heading to north
                gw.steerSouth();
                break;
            case 'e':
                //change heading to east
                gw.steerEast();
                break;
            case 'w':
                //change heading to west
                gw.steerWest();
                break;
            case 'i':
                //increase speed by 1 unit
                gw.increaseSpeed();
                break;
            case 'l':
                //lower cars speed by one unit, not < 0
                gw.decreaseSpeed();
                break;
            case 'b':
                //add a new monster ball, rand loc/color/heading/speed
                //keep speed small
                gw.addMonsterBall();
                break;
            case 'k':
                //add a new time ticket to gw, rand loc. time value relative to level
                gw.addTimeTicket();
                break;

            case 'g':
                //telling game you surrounded a group of squares
                gw.grouped();
                break;
            case '1':
                //tell game world that the car has collided with a monsterball
                gw.collisionMonster();
                break;
            case '2':
                //tell gameworld car has driven over a new square and now owns another square
                gw.completedSquare();
                break;
            case '3':
                //tell game world that the car has driven over a time ticket.
                gw.collisionTicket();
                break;
            case 't':
                //tell game world that the game clock has ticked.
                gw.tick();
                break;
            case 'd':
                //generate a display by outputting lines of text on the console describing
                //game state values. current lvl/livesLeft/clockValue/%squares owned/
                //min score for lvl
                gw.display();
                break;
            case 'm':
                //tell game world output a map
                gw.outputMap();
                break;
            case 'q':
                //call the method System.exit(0) to quit. confirm before exiting
                System.exit(0);
                break;
            default:
                //invalid input
                break;
        }
        return input;

    }


}
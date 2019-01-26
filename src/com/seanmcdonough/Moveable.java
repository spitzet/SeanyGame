package com.seanmcdonough;

public class Moveable extends GameObject {
    private int heading;
    private int speed;


    public Moveable(int heading, int speed) {

    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        //use heading and speed to increment movement
    }


}

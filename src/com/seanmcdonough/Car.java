package com.seanmcdonough;

import java.awt.*;

public class Car extends Moveable implements ISteerable{

    private int width;//must be same size or smaller than field squares
    private int height;

    public Car(int speed, int width, int height) {
        super(0, speed);
        super.setLocation(new Location( 247.5F, 2.5F));//car location starts
                                                             // in center of 50th from left square on bottom row
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean steer(int change) {
        int newHeading = change + super.getHeading();
        if(newHeading == 0 ||newHeading == 90 ||newHeading == 180 ||newHeading == 270) {
            super.setHeading(newHeading);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setColor(Color color) {
        //unchangable color
    }
}









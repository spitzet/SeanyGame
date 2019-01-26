package com.seanmcdonough;

import java.awt.*;

public class TimeTicket extends Fixed {
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public int time;
    private final int INITIAL_VALUE = 5;
    private final int DECREMENT = 2;

    public TimeTicket(int level){
        time = INITIAL_VALUE - (DECREMENT * (level-1));
    }


    @Override
    public void setColor(Color color) {
        //unchangeable color
    }
}

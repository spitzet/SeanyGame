package com.seanmcdonough;

import java.awt.*;

public class GameObject {
    private Location loc;
    Color color;

    public GameObject(){

    }
    public void setLocation(Location loc){
        this.loc = loc;
    }

    public Location getLoc(){
        return loc;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

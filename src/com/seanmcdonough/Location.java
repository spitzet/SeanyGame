package com.seanmcdonough;

public class Location {
    private float x;
    private float y;

    public Location(float x, float y){
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Invalid parameters!");
        }
    }
}

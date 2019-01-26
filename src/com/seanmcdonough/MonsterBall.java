package com.seanmcdonough;

public class MonsterBall extends Moveable {


    private static final int RADIUS = 3;
    public MonsterBall(int heading, int speed){
        super(heading, speed);
        initialize();
    }

    private void initialize(){
        //random location
        //random heading
        //random speed
        //random color
    }

    @Override
    public void move() {
        //check if within rectangular field
        super.move();
    }
    public void changeColor(){

    }

}

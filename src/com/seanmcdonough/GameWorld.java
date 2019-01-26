package com.seanmcdonough;

import java.awt.*;
import java.util.ArrayList;

public class GameWorld {

    ArrayList<FieldSquare> fieldSquares;
    ArrayList<GameObject> gameObjects;
    private int level;
    private int squaresOwned;
    Car car;
    int lives;
    private int timer;
    private int score;



    public GameWorld() {
        gameObjects = new ArrayList<GameObject>();
        squaresOwned = 396;
        lives = 3;
        timer = 20;
        makeFieldSquares();
        makeGameObjects();

    }
    private void makeFieldSquares(){
         //all squares along the border are owned at start. 396 total
        for(int i=0;i<9604;i++){
            FieldSquare fs = new FieldSquare();
            fieldSquares.add(fs);
        }
        for(int i=0;i<396;i++){
            FieldSquare fs = new FieldSquare(true);
            fieldSquares.add(fs);
        }
    }
    private void makeGameObjects(){

        car = new Car( 0, 0, 0);
    }
    public void steerNorth(){
        car.setHeading(0);
    }

    public void steerSouth(){
        car.setHeading(180);
    }

    public void steerEast(){
        car.setHeading(90);
    }

    public void steerWest(){
        car.setHeading(270);
    }

    public void increaseSpeed(){
        car.setSpeed((car.getSpeed()+1));
    }

    public void decreaseSpeed(){

    }

    public void addMonsterBall(){

    }

    public void addTimeTicket(){

    }

    public void grouped(){

    }

    public void collisionMonster(){
        lives--;
        car.setLocation(new Location(247.5f, 2.5f));
        MonsterBall ball = new MonsterBall(0, 10);
        Color newColor = new Color(1, 1, 1);
        ball.setColor(newColor);


    }

    public void completedSquare(){

    }

    public void collisionTicket(){

    }

    public void tick(){

    }

    public void display(){

    }

    public void outputMap(){

    }
    public int getLives(){
        return lives;
    }







}

package com.seanmcdonough;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameWorld {

    List<FieldSquare> fieldSquares;
    List<GameObject> gameObjects;
    private int level;
    private int squaresOwned;
    Car car;
    int lives;
    private int timer;
    private int score;
    private Random rand;



    public GameWorld() {
        gameObjects = new ArrayList<GameObject>();
        squaresOwned = 396;
        level = 1;
        lives = 3;
        timer = 10;
        rand = new Random();
        makeFieldSquares();
        makeGameObjects();

    }
    private void makeFieldSquares(){
        fieldSquares = new ArrayList<>();
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
        gameObjects = new ArrayList<>();
        car = new Car( 0, 0, 0);
    }
    public void steerNorth(){
        car.setHeading(0);
        System.out.println("Heading set to: " + car.getHeading());
    }

    public void steerSouth(){
        car.setHeading(180);
        System.out.println("Heading set to: " + car.getHeading());
    }

    public void steerEast(){
        car.setHeading(90);
        System.out.println("Heading set to: " + car.getHeading());
    }

    public void steerWest(){
        car.setHeading(270);
        System.out.println("Heading set to: " + car.getHeading());
    }

    public void increaseSpeed(){
        car.setSpeed((car.getSpeed()+1));
    }

    public void decreaseSpeed(){
        car.setSpeed((car.getSpeed()-1));
    }

    public void addMonsterBall(){
        var heading = (rand.nextInt(3))*90;
        var speed = 1;
        MonsterBall monsterBall = new MonsterBall(heading, speed);
        gameObjects.add(monsterBall);
    }

    public void addTimeTicket(){
        TimeTicket timeTicket = new TimeTicket(level);
        gameObjects.add(timeTicket);
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

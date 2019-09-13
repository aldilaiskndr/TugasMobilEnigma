package com.enigma.model;

public class Mobil {

    private Integer postX;
    private Integer postY;
    private Integer fuel=0;
    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private char [] commands;

    public Mobil(Integer x, Integer y){
        this.postX = x;
        this.postY = y;
    }

    public Integer fillFuel(Integer fuel){
        this.fuel= this.fuel + fuel;
        return fuel;
    }

    private void move(String movement){
        if(movement.equals(RIGHT)){
            this.postX++;
        }else if(movement.equals(FORWARD)){
            this.postY++;
         }else if(movement.equals(LEFT)){
            this.postX--;
        }else if(movement.equals(BACKWARD)){
            this.postY--;
        }
    }

    public String setCommands(String commands){
        this.commands = commands.toCharArray();
        return commands;
    }

    public void run(){
        for(int i=0;i<this.commands.length;i++){
            if(this.fuel<=0){
                System.out.println("MOGOK! MAMPIRLAH DIPERTAMINI!");
                break;
            }else {
            move(String.valueOf(this.commands[i]));
            System.out.println(this.commands[i] + getPost());
            if((i+1)%3==0){
                this.fuel--;
                }
            }
        }
    }

    public String getPost(){
        return "("+this.postX+","+this.postY+")";
    }
    public String print() {
        return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel+
                '}';
    }
}




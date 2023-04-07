package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    boolean end = intersectsPipes();;
    int ground = 590;
    int score = 0;
 int x = 400;
 int y = 300;
 int birdYVelocity =  -1;
 int gravity = 1;
int pipeX = 0;
int pipeY = 0;
int pipeH = (int) random(100, 400);
int pipeGap = 300;
int lowerY = 500;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
     
    }

    @Override
    public void draw() {
    	background(0, 150, 180);
    	 
    	fill(10, 150, 0);
    	rect(pipeX, pipeY, 100, pipeH);
    	rect(0, ground, 800, 10);
    	fill(200, 200, 200);
    	fill(10, 150, 0);
    	rect(pipeX, 500, 100, lowerY);
    	fill(200, 200, 200);
    	stroke(200, 200, 200);
    	ellipse(x, y, 20, 20);
    	mousePressed();
    	  
    	 
    	pipeX = pipeX + 5; 
    	gravity = gravity - birdYVelocity;
    	y = y + gravity;
    	if(pipeX > HEIGHT) {
    		pipeX = 0;
    		pipeH = (int) random(100, 400);
    		lowerY = pipeH + pipeGap;
    	}
    	if (y < pipeH &&  x > pipeX && x < (pipeX+100)){
         end = true; }
        else if (y>lowerY && x > pipeX && x < (pipeX+100)) {
            end = true; }
        else { end = false; score = score + 1;} 
    	 if( end == true) {
 	    	pipeX = 0; 
 	    	text(" your score is "+score+".", 400, 300);
 	    	
 	 }
     }
    	
    
    	
  
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    public void mousePressed() {
    	if(mousePressed) {
    		gravity = 1;
    		birdYVelocity = -1;
    		y = y - 10;
    	}
    	}
    boolean intersectsPipes() { 
        if (y < pipeH &&  x > pipeX && x < (pipeX+100)){
           return true; }
       else if (y>lowerY && x > pipeX && x < (pipeX+100)) {
           return true; }
       else { return false; 
}
    }
}

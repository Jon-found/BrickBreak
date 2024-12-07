

import java.awt.*;

// Jonathan Koushan 12/3/24
// Makes a ball for BrickBreak. Dermains speed and any other factors that may realte to the ball in any way, (unless all ready stated in a other class)
public class Ball {

    private int x;
    private int y;
    private int radius;
    private int xVelocity; // Velocity in the x-direction
    private int yVelocity; // Velocity in the y-direction
//sets values for the ball.
//all values must be withen reason such as having them be withen int max/min and making the size of the ball postive.
    // Constructor
    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xVelocity = 1; // Initial velocity values
        this.yVelocity = -2;
    }

    // Getters and setters
    public int getSize() {
        return radius;
    }

    public int getYpos() {
        return y;
    }

    public int getXpos() {
        return x;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXVelocity() {
        return xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYVelocity() {
        return yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    // Movement method
    //no limitations on this code as it gets capped at later codes 
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Reverse ball's x-direction
    //no limits to code as it just switchs the direction of the ball.
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    // Reverse ball's y-direction
    //no limit of this method 
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Draws the ball
    //radius must be postive and exist.
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, radius, radius);
    }
}


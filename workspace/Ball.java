

import java.awt.*;

// Jonathan Koushan 12/3/24
// Makes a ball for BrickBreak.
public class Ball {

    private int x;
    private int y;
    private int radius;
    private int xVelocity; // Velocity in the x-direction
    private int yVelocity; // Velocity in the y-direction

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
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Reverse ball's x-direction
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    // Reverse ball's y-direction
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Draw the ball
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, radius, radius);
    }
}


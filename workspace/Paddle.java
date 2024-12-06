import java.awt.Graphics;
import java.awt.*;

public class Paddle {

    private int x;
    private int y;
    private int width;
    private int height;
    private int velocity; // Paddle velocity

    // Constructor
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0;
    }

    // Getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void addVelocity(int velocity) {
        this.velocity += velocity;
    }

    // Movement method
    public void move() {
        x += velocity;

        // Prevent paddle from moving off-screen
        if (x < 0) {
            x = 0;
        }
        if (x + width > 682) { // Assuming the screen width is 682
            x = 682 - width;
        }
    }

    // Draw the paddle
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
    }
}

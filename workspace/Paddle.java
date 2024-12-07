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
//velocity may be whatever becuase if it exceeds an amount it will be resets to an reasobale amount.
//manges speed of the paddle. and resests if it gets to high.
    public void addVelocity(int velocity) {
        this.velocity += velocity;
        if(velocity > 6){
            velocity = 6;
        }
    if (velocity< -6){

        velocity=-6;
    }
    }

    // Movement method, makes sure it doesnt exceed an high amount of speed.
    //screen width has to be 682 and x/ velocity has to be the same.
    public void move() {
        x += velocity;
        if(velocity>0){
            velocity --;
        }
        if(velocity<0){
            velocity++;
        }
        // Prevent paddle from moving off-screen
        if (x < 0) {
            x = 0;
        }
        if (x + width > 682) { // screen width is 682
            x = 682 - width;
        }
    }

    // Draw the paddle
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
    }
}

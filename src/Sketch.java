
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
//hi
import processing.core.PApplet;

public class Sketch extends PApplet {

    
    Ball[] balls;
    Bubble[] bubbles;
    Snowflake[] snowflakes;
    

    public void settings() {
        size(500, 500);
    }

    
    public void setup() {
        frameRate(30);
        balls = new Ball[]{new Ball(this), new Ball(this, 150,7,7), new Ball(this), new Ball(this)};

        bubbles = new Bubble[]{new Bubble(this,170,255,-3,-3),new Bubble(this,170,255,-4,-4),new Bubble(this,170,255,-4,-4),new Bubble(this,170,255,-3,-3)};

        snowflakes = new Snowflake[]{new Snowflake(this), new Snowflake(this), new Snowflake(this),new Snowflake(this)};
    }

    public void draw() {
        background(100);

        balls[0].drawBall();
        balls[0].moveBall();
        balls[1].drawBall();
        balls[1].moveBall();
        balls[2].drawBall();
        balls[2].moveBall();
        balls[3].drawBall();
        balls[3].moveBall();

        bubbles[0].drawBubble();
        bubbles[0].moveBubble();
        bubbles[1].drawBubble();
        bubbles[1].moveBubble();
        bubbles[2].drawBubble();
        bubbles[2].moveBubble();
        bubbles[3].drawBubble();
        bubbles[3].moveBubble();
        
        snowflakes[0].drawSnowflake();
        snowflakes[0].moveSnowflake();
        snowflakes[1].drawSnowflake();
        snowflakes[1].moveSnowflake();
        snowflakes[2].drawSnowflake();
        snowflakes[2].moveSnowflake();
        snowflakes[3].drawSnowflake();
        snowflakes[3].moveSnowflake();


        
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }
    

    public void mousePressed(){
      balls[1].stop();
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

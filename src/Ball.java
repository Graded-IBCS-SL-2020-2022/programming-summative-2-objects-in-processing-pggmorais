/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */

class Ball {
    private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col;
    private float speedY;
    private float speedX;


    public Ball(Sketch sketch) {
        s = sketch;
        diameter = s.random(120,130); 
        x = s.random(diameter / 2, s.width - diameter / 2);
        y = s.random(diameter / 2, s.height - diameter / 2);
        col = s.randomColor(false);
        speedY = s.random(7,10);
        speedX = s.random(7,10);

      }  
       
    public Ball (Sketch sketch, float ballDiam, float ballSpeedX, float ballSpeedY){
      
      s = sketch;
      diameter = ballDiam;
      x = s.random(diameter / 2, s.width - diameter / 2);
      y = s.random(diameter / 2, s.height - diameter / 2);
      col = s.randomColor(false);
      speedX = ballSpeedX;
      speedY = ballSpeedY;

    }
  

        
      
      
    public float getRadius(){
      return diameter / 2;
    
      }


   
   public void stop(){
     speedX = 0;
     speedY = 0;

   }

   public void start(){
     speedX = s.random(7,8);
     speedY = s.random(7,8);
   }


    /*
     * SUMMATIVE OPTIONAL Add a method called `stop()` that sets the ball speed to
     * 0, and another one called `start()` that starts it moving again, either at
     * the same speed as before or a random speed.
     * 
     * If you create the methods, you'll need to think of a way to test them...
     */

    /** Draws the ball. */
    public void drawBall() {
        /*
         * SUMMATIVE OPTIONAL Make it possible to change the border color of these balls
         * as well as the fill color. Change the `sketch.stroke(col)` line below to use
         * the border color to make it show up. You will need to make other changes too.
         */

        s.stroke(col);
        s.fill(col);
        s.ellipse(x, y, diameter, diameter);
    }

    /** Moves the balls. */
    public void moveBall() {

        /* If the ball is on the edge, flip the direction. Bounce! */
        if (x > (s.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y > (s.height - getRadius()) || y < getRadius()) {
            speedY = -speedY;
        }
       
        x += speedX;
        y += speedY;
    }
}
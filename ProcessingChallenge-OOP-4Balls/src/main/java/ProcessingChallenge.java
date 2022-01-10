import processing.core.PApplet;

public class ProcessingChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    Balls balls;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        balls = new Balls(this, WIDTH, HEIGHT, DIAMETER);
    }

    @Override
    public void draw() {
        balls.process4Balls();
        balls.incrementX();
    }
}

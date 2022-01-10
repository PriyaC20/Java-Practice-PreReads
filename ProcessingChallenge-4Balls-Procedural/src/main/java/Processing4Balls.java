import processing.core.PApplet;

public class Processing4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int x = 0;

    public static void main(String[] args) {
        PApplet.main("Processing4Balls", args);
    }

    @Override
    public void setup() {
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        process4Balls();
        incrementX();
    }

    private void process4Balls() {
        for (int i=1; i<=4; i++)
            drawCircle(i, i);
    }

    private void drawCircle(int speed, int y) {
        ellipse(x*speed, HEIGHT*y/5, DIAMETER, DIAMETER);
    }

    private void incrementX() {
        x++;
    }

}


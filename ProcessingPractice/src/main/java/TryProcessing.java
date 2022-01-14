import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;
    private int x=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        paintWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x, HEIGHT/2, DIAMETER, DIAMETER);
        x++;
    }

    private void paintWhite() {
        background(255);
    }
}

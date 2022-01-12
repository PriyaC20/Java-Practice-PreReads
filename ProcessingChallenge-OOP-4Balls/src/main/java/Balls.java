import processing.core.PApplet;

public class Balls{

    private PApplet p;
    public static int WIDTH;
    public static int HEIGHT;
    public static int DIAMETER;
    private static int x;

    public Balls(PApplet p, int WIDTH, int HEIGHT, int DIAMETER) {
        this.p = p;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.DIAMETER = DIAMETER;
        x = 0;
    }

    public void process4Balls() {
        for (int i = 1; i <=4 ; i++) {
            drawBall(i, i);
        }
    }

    private void drawBall(int speed, int y) {
        p.ellipse(x*speed, HEIGHT *y/5, DIAMETER, DIAMETER);
    }

    public void incrementX() {
        x++;
    }
}

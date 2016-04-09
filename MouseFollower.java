package Class05_Multimedia;


public class MouseFollower {
    public static void main(String[] args) {
        StdDraw.filledCircle(0.5, 0.5, 0.01);
        double v = 0.05;
        double x = 0.5;
        double y = 0.5;
        double r = Math.random()*255;
        double g = Math.random()*255;
        double b = Math.random()*255;
        while (true) {
            x += (StdDraw.mouseX() - x) / 10;
            y += (StdDraw.mouseY() - y) / 10;
            StdDraw.filledCircle(x, y, 0.03);
            //StdDraw.setPenColor(r, g, b);
            StdDraw.show(1000/24);
            StdDraw.clear();
        }
    }
}

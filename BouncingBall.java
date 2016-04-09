package Class05_Multimedia;

import java.util.Random;
import java.util.Scanner;
public class BouncingBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of balls: ");
        int N = scan.nextInt();
        Random rGen = new Random();

        //double x = Math.random(), y = Math.random(), vx = Math.random(), vy = Math.random();

        double[] x = new double[N];
        double[] y = new double[N];
        double[] vx = new double[N];
        double[] vy = new double[N];
        int[] red = new int[N];
        int[] green = new int[N];
        int[] blue = new int[N];
        double r = 0.02;


        for (int i = 0; i < N; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
            vx[i] = Math.random();
            vy[i] = Math.random();
            red[i] = rGen.nextInt(255);
            green[i] = rGen.nextInt(255);
            blue[i] = rGen.nextInt(255);

        }

        red[0] = 0;
        green[0] = 255;
        blue[0] = 255;


        while(true){
            for (int i = 0; i < N; i++) {
                StdDraw.setPenColor(red[i], green[i], blue[i]);
                StdDraw.filledCircle(x[i], y[i], r);
                x[i] += vx[i] / 10;
                y[i] += vy[i] / 10;
                if (x[i] + r >= 1 || x[i] - r <= 0){
                    vx[i] = vx[i] * -1;
                    // x[i] += vx[i] / 10;
                }
                if (y[i] + r >= 1 || y[i] - r <= 0){
                    vy[i] = vy[i] * -1;
                    y[i] += vy[i] / 10;
                }
                vy[i] -= 0.2;
                vy[i] = vy[i] * 0.99;
                vx[i] = vx[i] * 0.99;
            }
            StdDraw.show(1000/24);
            StdDraw.clear();

        }
    }
}

package ch.hslu.ad.sw07.n1.balls;

import java.awt.geom.Ellipse2D;

public class MainBall {

    public static void main(final String[] args) {
        Canvas board = Canvas.getCanvas();
        Ball newBall = new Ball();
        board.draw(newBall, "blue", new Ellipse2D.Double(0, 0, newBall.getDiameter(), newBall.getDiameter()));
        final Thread thread = new Thread(newBall, "Ball number 1");
        Ball newBall2 = new Ball();
        final Thread thread2 = new Thread(newBall2, "Ball number 2");
        thread.start();
        thread2.start();
    }
}

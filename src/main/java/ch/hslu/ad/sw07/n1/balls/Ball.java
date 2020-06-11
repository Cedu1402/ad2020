package ch.hslu.ad.sw07.n1.balls;

public final class Ball extends Circle implements Runnable {

    private int gravity;
    private String color;

    public Ball(){
        super((int)(Math.random() * 30) + 20,  10, 20, "blue");
        this.gravity =  (int)(Math.random() * 10) + 1;
        this.color = "blue";
        this.makeVisible();
    }

    private boolean reachedBottom(){
        return this.getY() + this.getDiameter() + this.gravity >= 400;
    }


    @Override
    public void run() {
        while(!this.reachedBottom()){
            this.moveVertical(this.gravity);
        }
        this.moveVertical(this.gravity);
        this.makeInvisible();
    }
}

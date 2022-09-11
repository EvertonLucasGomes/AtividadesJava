public class MovablePoint extends Point {
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() {
        return this.xSpeed;
    }

    public int getYSpeed() {
        return this.ySpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int[] getSpeed() {
        int[] arr = { this.xSpeed, this.ySpeed };
        return arr;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    public MovablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }
}

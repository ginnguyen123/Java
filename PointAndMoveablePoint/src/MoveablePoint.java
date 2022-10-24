public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){};
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getXYSpeed(){
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }
    public void setXYSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint Move(float x, float y){
        x = getX() + getXSpeed();
        y = getY() + getYSpeed();
        return this;
    }
    public String toString(){
        return super.toString() + ", speed = (" + this.xSpeed + "," + this.ySpeed + ")";
    }
}

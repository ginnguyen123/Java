public class Point {
    private float x;
    private float y;
    public Point(){};
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }
    public void setXY(float x, float y){
        float[] arr = {this.x = x, this.y = y};
    }
    @Override
    public String toString(){
        return "(" + getX() +"," + getY()+")";
    }
}

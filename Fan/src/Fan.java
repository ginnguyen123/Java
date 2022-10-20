public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean onOff = false;
    private double radius = 5f;
    private String color = "blue";
    public Fan(){}
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOnOff(){
        return onOff;
    }
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        String str ="";
        if (this.onOff == true){
            str+= getSpeed()+"\t"+getColor()+"\t"+getRadius()+"fan is on";
        }else {
            str+=getColor()+"\t"+getRadius()+"\tfan is off";
        }
        return str;
    }
}

package ra;

public class Fan {
    //cac thuoc tinh
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //cac ham tao contructors
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    //3. Cac phuong thuc (Method)
    //3.1. Cac phuong thuc getter/setter

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Speed: "+this.speed+" - Color: "+this.color+" - Radius: "+this.radius+" - Fan is on";
        }else{
            return "Color: "+this.color+" - Radius: "+this.radius+" - Fan is off";
        }
}
}
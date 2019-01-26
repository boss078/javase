
public class Speed {

    Speed(double strength, double angle){
        this.strength = strength;
        this.angle = angle;
        this.xSpeed = Math.cos(this.angle) * this.strength;
        this.ySpeed = Math.sin(this.angle) * this.strength;
    }

    private double angle;
    private double strength;
    private double xSpeed;
    private double ySpeed;

    public double getAngle() {
        return angle;
    }

    public double getXSpeed() {
        this.xSpeed = Math.cos(this.angle) * this.strength;
        return xSpeed;
    }

    public double getYSpeed() {
        this.ySpeed = Math.sin(this.angle) * this.strength;
        return ySpeed;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
}

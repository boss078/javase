import javafx.beans.property.DoubleProperty;
import javafx.scene.shape.Circle;

public class BallPhysThread extends Thread {

    private Speed ballSpeed;
    private long fps;

    public void run(Circle pinBall, DoubleProperty ballCenterX, DoubleProperty ballCenterY,  Speed ballSpeed, long fps) {
        this.ballSpeed = ballSpeed;
        this.fps = fps;
        while (true) {
            try {
                sleep(fps);
            } catch (java.lang.InterruptedException ex) {
                //Sorry, nothing here
            }

            ballCenterX.set(pinBall.getCenterX() + (ballSpeed.getXSpeed() * fps / 1000));
            ballCenterY.set(pinBall.getCenterY() + (ballSpeed.getYSpeed() * fps / 1000));
            if (pinBall.getCenterX() > 10 && pinBall.getCenterY() < -10){
                return;
            }
        }
    }
}

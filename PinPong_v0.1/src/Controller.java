import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.concurrent.atomic.AtomicReference;

public class Controller {

    @FXML
    public Circle pinBall;
    @FXML
    public Rectangle upperWall;
    @FXML
    public Rectangle lowerWall;
    @FXML
    public Rectangle leftWall;
    @FXML
    public Rectangle rightWall;

    private DoubleProperty ballCenterX;
    private DoubleProperty ballCenterY;

    public void initialize() {
        ballCenterX = new SimpleDoubleProperty(pinBall.getLayoutX());
        ballCenterY = new SimpleDoubleProperty(pinBall.getLayoutY());
        pinBall.layoutXProperty().bind(ballCenterX);
        pinBall.layoutYProperty().bind(ballCenterY);
    }

    public void start(ActionEvent actionEvent) {
        //BallPhysThread ballThread = new BallPhysThread();
        //Speed currSpeed = new Speed(500, Math.PI / 3);
        //ballThread.run(pinBall, ballCenterX, ballCenterY, startSpeed, 1000);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        //timeline.setAutoReverse(true);
        double fps = 10;
        AtomicReference<Double> ySpeedVar = new AtomicReference<>((double) 2);
        AtomicReference<Double> xSpeedVar = new AtomicReference<>((double) 4);

        final KeyFrame kf = new KeyFrame(Duration.millis(fps), event -> {
            if (ballCenterY.get() - pinBall.getRadius() <= upperWall.getLayoutY() + upperWall.getHeight()
                    || ballCenterY.get() + pinBall.getRadius() >= lowerWall.getLayoutY())
            {
                ySpeedVar.updateAndGet(v -> v * -1);
            }
            if (ballCenterX.get() - pinBall.getRadius() <= leftWall.getLayoutX() + leftWall.getWidth()
                    || ballCenterX.get() + pinBall.getRadius() >= rightWall.getLayoutX())
            {
                xSpeedVar.updateAndGet(v -> v * -1);
            }
            ballCenterX.set(pinBall.getLayoutX() + xSpeedVar.get());
            ballCenterY.set(pinBall.getLayoutY() + ySpeedVar.get());
            //if (pinBall.getCenterX() > 10 && pinBall.getCenterY() < -10){
            //    return;
            //}
        }
        );

        timeline.getKeyFrames().add(kf);
        timeline.play();
    }
}

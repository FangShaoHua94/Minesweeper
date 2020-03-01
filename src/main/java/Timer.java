import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.StringProperty;
import javafx.util.Duration;

public class Timer {

    private Timeline timeline;
    private final StringProperty timeSeconds = new ReadOnlyStringWrapper(String.format("%03d",0));

    public Timer(){
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> updateTime()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeSeconds.set(String.format("%03d",0));
        activate();
    }

    private void activate(){
        timeline.play();
    }

    private void updateTime() {
        int seconds = Integer.parseInt(timeSeconds.get());
        timeSeconds.set(String.format("%03d",seconds+1));
    }

    public StringProperty getTimeSeconds(){
        return timeSeconds;
    }
}

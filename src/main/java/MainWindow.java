
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class MainWindow extends AnchorPane {

    @FXML
    private GridPane boardPane;

    @FXML
    private AnchorPane topWindow;

    @FXML
    private Button smiley;

    @FXML
    private Label timeDisplay;

    @FXML
    private Label mineCountDisplay;

    private Board board;
    private Timer timer;

    @FXML
    public void initialize(){
        timer=new Timer();
        board=new Board(boardPane);
        board.addObserver(timer);
        timeDisplay.textProperty().bind(timer.getTimeSeconds());
        mineCountDisplay.textProperty().bind(board.getFlagCountDisplay());

    }

    @FXML
    public void resetGame(){
        initialize();
    }

}

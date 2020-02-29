
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

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

    @FXML
    public void initialize(){
        board=new Board(boardPane);
    }

    @FXML
    public void aaa(){
        smiley.setStyle("-fx-background-color: red");
    }


}

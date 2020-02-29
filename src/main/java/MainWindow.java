
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainWindow extends AnchorPane {

    @FXML
    private GridPane board;

    @FXML
    private AnchorPane topWindow;

    @FXML
    private Button smiley;

    @FXML
    private Label timeDisplay;

    @FXML
    private Label mineCountDisplay;

    private static final int NUM_TILE=16;

    @FXML
    public void initialize(){
        double width=board.getPrefWidth();
        double height=board.getPrefHeight();
        double tileWidth=width/NUM_TILE;
        double tileHeight=height/NUM_TILE;

        for(int i=0;i<NUM_TILE;i++){
            for(int j=0;j<NUM_TILE;j++){
                board.add(new Tile(i,j,tileWidth,tileHeight),i,j);
            }
        }
    }

    @FXML
    public void aaa(){
        smiley.setStyle("-fx-background-color: red");
    }


}

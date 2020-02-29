
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
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

    @FXML
    public void aaa(){
        smiley.setStyle("-fx-background-color: red");
    }

    @FXML
    public void initialize(){
        int row=board.getRowCount();
        int col=board.getColumnCount();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Bounds b=board.getCellBounds(1,1);
                board.add(new Tile(i,j),i,j);
            }
        }
    }

}

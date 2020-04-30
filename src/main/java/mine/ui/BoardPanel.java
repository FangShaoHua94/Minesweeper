package mine.ui;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import mine.model.Board;
import mine.model.Tile;

public class BoardPanel extends UiPart<Region>{

    private static final String FXML = "BoardPanel.fxml";

    private Board board;

    @FXML
    private GridPane boardPane;

    public BoardPanel(Board board) {
        super(FXML);
        this.board=board;
        setUp();
    }

    private void setUp(){
        for(int i=0;i<board.getHeight();i++){
            for(int j=0;j<board.getWidth();j++){
                Button button=new Button();
                button.setPrefSize(30,30);
                button.setMinSize(30,30);
                button.setMaxSize(30,30);
                boardPane.add(button,i,j);
            }
        }
    }

}

package mine.ui;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mine.logic.Logic;

public class MainWindow extends UiPart<Stage> {

    private static final String FXML = "MainWindow.fxml";

    private Stage primaryStage;
    private Logic logic;
    private Board board;
    private InfoDisplay infoDisplay;

    @FXML
    private MenuItem menuItem;

    @FXML
    private StackPane infoDisplayPlaceholder;

    @FXML
    private StackPane boardPlaceholder;

    public MainWindow(Stage primaryStage, Logic logic){
        super(FXML,primaryStage);
        this.primaryStage = primaryStage;
        this.logic=logic;
    }

    public void show(){
        primaryStage.show();
    }

    public void fillInnerParts(){
        infoDisplay = new InfoDisplay();
        infoDisplayPlaceholder.getChildren().add(infoDisplay.getRoot());

        board = new Board();
        boardPlaceholder.getChildren().add(board.getRoot());
    }

}

package mine.ui;

import javafx.scene.layout.Region;
import mine.model.Board;

public class BoardPanel extends UiPart<Region>{

    private static final String FXML = "BoardPanel.fxml";

    private Board board;

    public BoardPanel(Board board) {
        super(FXML);
        this.board=board;
    }




}


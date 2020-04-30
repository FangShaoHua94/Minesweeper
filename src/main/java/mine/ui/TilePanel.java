package mine.ui;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import mine.model.Tile;

import javafx.scene.layout.Region;

public class TilePanel extends UiPart<Region> {

    private static final String FXML = "TilePanel.fxml";

    private Tile tile;

    @FXML
    private Label value;

    @FXML
    private Button button;

    public TilePanel(Tile tile) {
        super(FXML);
        this.tile=tile;
    }


}

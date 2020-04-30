package mine.ui;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import mine.model.Tile;

public class TilePanel extends StackPane {

    private Tile tile;

    private Label value;
    private Button button;

    public TilePanel(Tile tile) {
        this.tile=tile;
    }



}

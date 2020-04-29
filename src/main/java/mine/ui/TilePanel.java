package mine.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.plaf.synth.Region;


public class TilePanel extends UiPart<Region> {

    private static final String FXML = "TilePanel.fxml";

    @FXML
    private Label value;

    @FXML
    private Button button;

    public TilePanel() {
        super(FXML);
    }



}

package mine.ui;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
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
        setUpClick();
    }

    // todo - on mouse drag effect
    public void setUpClick(){
        if(tile.isRevealedTile()){
            return;
        }
        button.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            if (e.getButton() == MouseButton.SECONDARY) {
                if (tile.isFlaggedTile()) {
                    tile.removeFlag();
                } else {
                    tile.flagTile();
                }
            }
        });
        button.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                System.out.println(getRoot().getParent());
                tile.revealTile();
            }
        });
    }
}

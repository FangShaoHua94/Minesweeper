package logic;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    public static final int SIZE = 20;

    private final int rowIndex;
    private final int columnIndex;

    /**
     * Initiates the tile with gui details.
     * @param rowIndex the row index of the tile.
     * @param columnIndex the column index of the tile.
     */
    public Tile(int rowIndex, int columnIndex) {
        super(SIZE, SIZE);
        setLayoutX(rowIndex * SIZE + 1);
        setLayoutY(columnIndex * SIZE + 1);
        setFill(Color.GRAY);
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }


}

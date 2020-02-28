package logic;


import java.util.ArrayList;
import java.util.List;

import static logic.Tile.SIZE;

public class Board {

    private final int row;
    private final int column;
    private List<Tile> tiles = new ArrayList<>();

    /**
     * Initiates the board with tiles.
     * @param width the width of the board.
     * @param height the height of the board.
     */
    public Board(int width, int height) {
        row = width / SIZE;
        column = height / SIZE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                tiles.add(new Tile(i, j));
            }
        }
    }

    public List<Tile> getTiles() {
        return tiles;
    }

}

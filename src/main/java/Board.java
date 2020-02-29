import javafx.scene.layout.GridPane;

public class Board{

    private static final int NUM_TILE=16;
    private final GridPane board;

    public Board(GridPane board){
        this.board=board;
        initializeBoard();
    }

    private void initializeBoard(){
        for(int i=0;i<NUM_TILE;i++){
            for(int j=0;j<NUM_TILE;j++){
                board.add(new Tile(i,j,board.getPrefWidth()/NUM_TILE,
                        board.getPrefHeight()/NUM_TILE),i,j);
            }
        }
    }



}

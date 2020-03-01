import javafx.scene.layout.GridPane;

import java.util.Random;

public class Board{

    private static final int NUM_TILE=16;
    private static final int MINE_COUNT=40;
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

    public void setMines(int row,int col){
        for(int i=0;i<MINE_COUNT;i++){
            do{
                Random random = new Random(System.currentTimeMillis());
                board.getChildren().get(random.nextInt(NUM_TILE)*NUM_TILE+random.nextInt(NUM_TILE));
            }while()

        }
    }



}

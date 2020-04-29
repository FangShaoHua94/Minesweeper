package mine.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mine.logic.difficulty.Difficulty;

public class Board {

    private Difficulty difficulty;
    private ObservableList<ObservableList<Tile>> board = FXCollections.observableArrayList();;

    public Board(Difficulty difficulty){
        this.difficulty=difficulty;
        setUpTile();
    }

    private void setUpTile(){
        for(int i=0;i<difficulty.getHeight();i++){
            ObservableList<Tile> row = FXCollections.observableArrayList();
            for(int j=0;j<difficulty.getWidth();j++){
                row.add(new Tile());
            }
            board.add(row);
        }
    }


}

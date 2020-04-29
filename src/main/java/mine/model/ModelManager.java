package mine.model;

import mine.logic.difficulty.Difficulty;

public class ModelManager implements Model{

    private Board board;

    public void setUpBoard(Difficulty difficulty){
        board = new Board(difficulty);
    }

    @Override
    public Board getBoard() {
        return board;
    }


}

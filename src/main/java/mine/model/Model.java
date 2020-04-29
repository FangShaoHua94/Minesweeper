package mine.model;

import mine.logic.difficulty.Difficulty;

public interface Model{

    void setUpBoard(Difficulty difficulty);

    Board getBoard();
}

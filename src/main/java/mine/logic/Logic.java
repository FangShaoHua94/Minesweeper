package mine.logic;

import mine.logic.difficulty.Difficulty;
import mine.model.Board;

public interface Logic {

    void setUpBoard(Difficulty difficulty);

    void initializeBoard();

    Board getBoard();
}

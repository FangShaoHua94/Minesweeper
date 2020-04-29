package mine.logic;

import mine.logic.difficulty.Difficulty;
import mine.logic.difficulty.Intermediate;
import mine.model.Board;
import mine.model.Model;
import mine.storage.Storage;

public class LogicManager implements Logic{

    private static final Difficulty DEFAULT_DIFFICULTY= new Intermediate();
    private Model model;
    private Storage storage;

    public LogicManager(Model model, Storage storage){
        this.model=model;
        this.storage=storage;
        initializeBoard();
    }

    public void initializeBoard(){
        setUpBoard(DEFAULT_DIFFICULTY);
    }

    public void setUpBoard(Difficulty difficulty){
        model.setUpBoard(difficulty);
    }

    public Board getBoard(){
        return model.getBoard();
    }

}

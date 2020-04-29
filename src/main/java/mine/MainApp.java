package mine;

import javafx.application.Application;
import javafx.stage.Stage;
import mine.logic.Logic;
import mine.logic.LogicManager;
import mine.model.Model;
import mine.model.ModelManager;
import mine.storage.Storage;
import mine.storage.StorageManager;
import mine.ui.Ui;
import mine.ui.UiManager;

public class MainApp extends Application {

    protected Ui ui;
    protected Logic logic;
    protected Model model;
    protected Storage storage;


    @Override
    public void init(){
        model = new ModelManager();
        storage = new StorageManager();
        logic = new LogicManager(model,storage);
        ui = new UiManager(logic);
    }

    @Override
    public void start(Stage primaryStage) {
        ui.start(primaryStage);
    }

}

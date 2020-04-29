package mine;

import javafx.application.Application;
import javafx.stage.Stage;
import mine.ui.Ui;
import mine.ui.UiManager;

public class MainApp extends Application {


    protected Ui ui;

    @Override
    public void init(){
        ui = new UiManager();
    }

    @Override
    public void start(Stage primaryStage) {
        ui.start(primaryStage);
    }

}

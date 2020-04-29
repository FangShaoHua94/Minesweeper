package mine.ui;

import javafx.stage.Stage;
import mine.logic.Logic;

public class UiManager implements Ui{

    private MainWindow mainWindow;
    private Logic logic;


    public UiManager(Logic logic){
        this.logic=logic;
    }

    @Override
    public void start(Stage primaryStage) {
        mainWindow = new MainWindow(primaryStage, logic);
        mainWindow.show();
        mainWindow.fillInnerParts();
    }
}

package mine.ui;

import javafx.stage.Stage;

public class MainWindow extends UiPart<Stage> {

    private static final String FXML = "MainWindow.fxml";

    private Stage primaryStage;

    public MainWindow(Stage primaryStage){
        super(FXML,primaryStage);
        this.primaryStage = primaryStage;
    }

}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import logic.Game;


public class Main extends Application {

    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Game game = new Game(WIDTH, HEIGHT);
        root.getChildren().addAll(game.getBoard().getTiles());
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

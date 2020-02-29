import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javafx.scene.input.MouseEvent;

public class Tile extends StackPane {

    private final double width;
    private final double height;

    private final int row;
    private final int col;

    private Button button;
    private Label label;

    public Tile(int row,int col,double width,double height){
        this.row=row;
        this.col=col;
        this.width=width;
        this.height=height;
        setPrefSize(width,height);
        getStylesheets().add(getClass().getResource("/view/Tile.css").toExternalForm());
        setUp();
    }

    private void setUp(){
        label=new Label();
        label.setPrefSize(width,height);
        button=new Button();
        button.setPrefSize(width,height);
        button.setStyle("-fx-background-radius: 0");
        button.addEventFilter(MouseEvent.MOUSE_PRESSED, e->{
            if(e.isPrimaryButtonDown()) {
                button.setVisible(false);
                label.setText("H");
            }else if(e.isSecondaryButtonDown()){
                button.setStyle("-fx-background-color: red");
            }
        });
        getChildren().addAll(label,button);
    }





}

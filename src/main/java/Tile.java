import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import javafx.scene.input.MouseEvent;

public class Tile extends StackPane {

    private final double width;
    private final double height;
    private final int row;
    private final int col;

    private Button button;
    private Label label;

    private boolean isRevealed=false;
    private boolean isFlagged=false;
    private boolean isMine=false;

    public Tile(int row,int col,double width,double height){
        this.row=row;
        this.col=col;
        this.width=width;
        this.height=height;
        setUpTile();
    }

    private void setUpTile(){
        getStylesheets().add(getClass().getResource("/view/Tile.css").toExternalForm());
        setPrefSize(width,height);
        setUpLabel();
        setUpButton();
        getChildren().addAll(label,button);
    }

    private void setUpLabel(){
        label=new Label();
        label.setPrefSize(width,height);
    }

    private void setUpButton(){
        button=new Button();
        button.setPrefSize(width,height);
        button.addEventFilter(MouseEvent.MOUSE_PRESSED, e->{
            if(!isRevealed) {
                if (e.isPrimaryButtonDown()) {
                    button.setVisible(false);
                    label.setText("H");
//                    revealTile();
                } else if (e.isSecondaryButtonDown()) {
                    if(!isFlagged){
                        flagTile();
                    }else{
                        unFlagTile();
                    }
                }
            }
        });
    }

    private void flagTile(){
        button.setStyle("-fx-text-fill: red;");
        button.setText("F");
        isFlagged=true;
    }

    private void unFlagTile(){
        button.setText("");
        isFlagged=false;
    }


}

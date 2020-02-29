import javafx.scene.layout.GridPane;

public class Board extends GridPane {

    private static final int TILE_NUMBER=16;

    private final double width;
    private final double height;

    public Board(double width,double height){
        this.width=width;
        this.height=height;
        setPrefSize(width,height);
        setVgap(0.7);
        setHgap(0.7);
        for(int i=0;i<TILE_NUMBER;i++){
            for(int j=0;j<TILE_NUMBER;j++){
                add(new Tile(i,j,width/TILE_NUMBER,height/TILE_NUMBER),i,j);
                setConstraints(new Tile(i,j,width/TILE_NUMBER,height/TILE_NUMBER),i,j);
            }
        }
        setStyle("-fx-background-color: black");
    }

}

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Tile extends Button {

    private final int rowIndex;
    private final int colIndex;
    private boolean isMine=false;
    private boolean isFlag=false;
    private boolean isReveal=false;

    public Tile(int rowIndex,int colIndex){
        this.colIndex=colIndex;
        this.rowIndex=rowIndex;
        setTile();

    }

    private void setTile(){
        setPrefSize(100,30);
        addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {
            if(!isReveal) {
                if (e.isPrimaryButtonDown()) {
//                    reveal();
//                    setStyle("-fx-background-color: white");
                    setVisible(false);
                } else if (e.isSecondaryButtonDown()) {
                    if(!isFlag){
                        isFlag=true;
                    }else{
                        isFlag=false;
                    }
                }
            }
        });
    }

    public boolean checkIsFlag(){
        return isFlag;
    }

    public void setMine(){
        isMine=true;
    }

    public void reveal(int neighbouringMineCount){

        isReveal=true;
    }


}

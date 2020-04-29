package mine.model;

public class Tile {

    private int neighbourMineCount;
    private boolean isReveal=false;
    private boolean isFlag=false;
    private boolean isMine=false;

    public void markAsMine(){
        isMine=true;
    }

    public boolean isMineTile(){
        return isMine;
    }

    public void flagTile(){
        isFlag=true;
    }

    public void removeFlag(){
        isFlag=false;
    }

    public boolean isFlaggedTile(){
        return isFlag;
    }

    public void revealTile(){
        isReveal=true;
    }

    public boolean isRevealedTile(){
        return isReveal;
    }

    public int getNeighbourMineCount(){
        return neighbourMineCount;
    }

    public void setNeighbourMineCount(int neighbourMineCount){
        this.neighbourMineCount=neighbourMineCount;
    }

}

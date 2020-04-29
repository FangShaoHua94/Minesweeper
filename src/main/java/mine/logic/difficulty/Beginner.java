package mine.logic.difficulty;

public class Beginner extends Difficulty{

    private static final int HEIGHT=9;
    private static final int WIDTH=9;
    private static final int MINE_COUNT=10;

    public Beginner() {
        super(HEIGHT, WIDTH, MINE_COUNT);
    }
}

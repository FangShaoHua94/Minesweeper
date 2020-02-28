package logic;

public class Game {

    private Board board;

    public Game(int width, int height) {
        board = new Board(width, height);
    }

    public Board getBoard() {
        return board;
    }

}

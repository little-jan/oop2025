package lab7;

public class MazeBoundsException extends Exception {
    public MazeBoundsException() {
        super("Position is outside the bounds of the maze.");
    }
}

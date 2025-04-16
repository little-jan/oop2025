package lab7;

public class Maze {
    private char[][] maze;

    public Maze(int rows, int cols) {
        char[][] initialMaze = new char[rows][cols];
        maze = initialMaze;
    }

    public void setWall(int row, int col) throws MazeBoundsException {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) throw new MazeBoundsException();
        maze[row][col] = '#';
    }

    public boolean isWall(int row, int col) throws MazeBoundsException {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) throw new MazeBoundsException();
        return (maze[row][col] == '#');
    }
}

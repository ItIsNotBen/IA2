import java.util.ArrayList;



public class Player {
    private String name;
    private int points;
    private char[][] grid;
    private ArrayList hand;
    private char selectedTile;
    private char selectedHandTile;


    Player(String name) {
        this.name = name;
        points = 0;
        grid = new char[10][10];
        // createGrid();
        hand = new ArrayList();
        selectedTile = ' ';
    }

    public void moveTile(int row, int column) {
        grid[row][column] = selectedTile;
        selectedTile = ' ';
    }


    public void selectGridTile(int row, int column) {
        selectedTile = grid[row][column];
    }

    // do select tile method
    public char getSelectedTile() {
        return selectedTile;
    }

    public void selectHandTile(int i) {
        selectedHandTile = (char) hand.get(i);
    }


    public void placeTile(int i, int j, char tile) {
        grid[i][j] = tile;
        hand.remove(Character.valueOf(tile));
    }

//    public void createGrid() {
//        for (int i)
//    }
    public void assignTiles(char[] tiles) {
        hand.add(tiles);

    }

    public void displayTiles() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }
    }

    }
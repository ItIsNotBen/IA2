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
        initGrid();
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

    private void initGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                grid[i][j] = ' ';
            }
        }

        public void assignTiles(char[] tiles) {
            for (int i = 0; i < tiles.length; i++) {
                hand.add(tiles[i]);
            }
        }

        public void assignTile(char tile) {
            hand.add(tile);
        }

    public void displayTiles() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }
    }

        public void findWords() {
            for(int i = 0; i < grid.length; i++) {

            }
        }

    }
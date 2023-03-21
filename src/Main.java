import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pouch pouch = new Pouch(26);
        Player player = new Player("Ben");


        char tiles[] = pouch.yieldTiles(14);
        player.assignTiles(tiles);
        player.displayTiles();


    }
}
public class Game {
    private Player player;
    private Pouch pouch;


    Game(String playerName, int numOfTiles) {
        player = new Player(playerName);
        pouch = new Pouch(numOfTiles);

    }

    public void dealTiles(int amountTilesGiven) {
        char[] givenTiles = pouch.yieldTiles(amountTilesGiven);
        player.assignTiles(givenTiles);
    }
}
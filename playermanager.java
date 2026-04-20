import java.util.ArrayList;

/**
 * Manages all players in the Chutes and Ladders game.
 */
public class PlayerManager {
    private ArrayList<Player> players;
    private int currentPlayerIndex;

    /**
     * Creates an empty player manager.
     */
    public PlayerManager() {
        players = new ArrayList<Player>();
        currentPlayerIndex = 0;
    }

    /**
     * Adds a new player to the game.
     *
     * @param name the player's name
     */
    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    /**
     * Returns all players.
     *
     * @return the list of players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Returns the current player whose turn it is.
     *
     * @return the current player
     */
    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    /**
     * Moves to the next player's turn.
     */
    public void nextTurn() {
        currentPlayerIndex++;

        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
        }
    }

    /**
     * Moves the current player forward by the number rolled on the die.
     *
     * @param roll the dice roll
     */
    public void moveCurrentPlayer(int roll) {
        getCurrentPlayer().move(roll);
    }

    /**
     * Checks whether the current player has won.
     *
     * @param finalTile the last tile on the board
     * @return true if current player reached or passed final tile, false otherwise
     */
    public boolean currentPlayerHasWon(int finalTile) {
        return getCurrentPlayer().getPosition() >= finalTile;
    }

    /**
     * Displays all player positions.
     */
    public void showPlayers() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
}
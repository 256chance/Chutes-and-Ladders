import java.util.ArrayList;

/**
 * Represents one player in the Chutes and Ladders game.
 */
public class Player {
    private String name;
    private int position;

    /**
     * Creates a player with the given name.
     * The player starts at position 0.
     *
     * @param name the player's name
     */
    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    /**
     * Returns the player's name.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the player's name.
     *
     * @param name the new player name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the player's current position on the board.
     *
     * @return the player's position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the player's position on the board.
     *
     * @param position the new position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Moves the player forward by a certain number of spaces.
     *
     * @param spaces number of spaces to move
     */
    public void move(int spaces) {
        position += spaces;
    }

    /**
     * Returns the player information as a string.
     *
     * @return player name and position
     */
    public String toString() {
        return name + " is on tile " + position;
    }
}
/**
 *
 * @author sohil
 */
public class Winning_Condition {
     static final int FINAL_TILE = 100;

    public static boolean checkWin(String playerName, int position) {

        if (position == FINAL_TILE) {
            System.out.println("\n🎉🎉 " + playerName + " WINS THE GAME! 🎉🎉");
            return true;
        }

        return false;
    }
}
// if (Winnig_Condition.checkWin(players[i], pos[i])) {
 //                   gameWon = true;
 //                   break;
 //               }
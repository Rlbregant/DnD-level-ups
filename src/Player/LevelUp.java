package Player;

import xp.xp;

public class LevelUp {
    public static void main(String[] args) {
        Player player = new Player();
        int x = player.getExperience();

        xp game = new xp(x);
        game.displayLevel();
    }
}
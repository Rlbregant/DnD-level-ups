package xp;

public class xp {

    int[] thresholds = { 300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000, 85000, 100000, 120000, 140000, 165000,
            195000, 225000, 265000, 305000, 355000 };
    int[] increments = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int y = 1;
    int level;

    public xp(int x) {
        this.level = y;
        for (int i = 0; i < thresholds.length; i++) {
            if (x >= thresholds[i]) {
                y = increments[i];
            }
        }
        this.level = y;
    }

    public void displayLevel() {
        switch (level) {
            case 1:
                System.out.println("Congratulations, you have reached level 2!");
                break;
            case 2:
                System.out.println("Congratulations, you have reached level 3!");
                break;
            case 3:
                System.out.println("Congratulations, you have reached level 4!");
                break;
            case 4:
                System.out.println("Congratulations, you have reached level 5!");
                break;
            // continue adding cases for each level up to the maximum level
            default:
                System.out.println("You have reached the maximum level!");
                break;
        }
    }
}
package xp;

public class xp {

	int[] thresholds = { 300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000, 85000, 100000, 120000, 140000, 165000,
			195000, 225000, 265000, 305000, 355000 };
	int[] increments = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	int experience;
	int level = 1;

	public xp(int experience) {
		this.experience = experience;
		this.level = 1;

		for (int i = 0; i < thresholds.length; i++) {
			if (experience < thresholds[i]) {
				break;
			}
			level = increments[i] - 1;
		}

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
			System.out.println("You've gained an ASI or Feat!");
			break;
		case 4:
			System.out.println("Congratulations, you have reached level 5!");
			break;
		default:
			System.out.println("You have reached the maximum level!");
			break;
		}
	}
}
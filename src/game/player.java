package game;

public class player {
	private int level;
	private int health;
	
	public player() {
		 health = 100;
		 level = 1;
	 }	

	public player(int lev) {
		level = lev;
		if (level == 1) {
			health = 100;
		} else if (level == 2) {
			health = 200;
		}
	}
}

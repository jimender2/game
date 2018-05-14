package game;

public class player {
	private int level;
	private int health;
	private int maxHealth;
	
	public player() {
		maxHealth = 100; 
		health = 100;
		 level = 1;
	 }	

	public player(int lev) {
		level = lev;
		maxHealth = lev * 100;
	}
	
	public void heal(int heal) {
		health = health + heal;
		if (health > maxHealth) {
			health = maxHealth;
		}
	}
	
	public void damage(int damage) {
		health = health - damage;
		if (health < 0) {
			health = 0;
		}
	}
	
	public void increaseLevel() {
		level = level + 1;
		maxHealth = level * 100;
	}
	
	public void decreaseLevel() {
		level = level - 1;
		maxHealth = level * 100;
	}
	
	public void setLevel(int lev) {
		level = lev;
		maxHealth = level * 100;
	}
	
}

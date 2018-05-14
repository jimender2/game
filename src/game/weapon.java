package game;

import java.util.Random;

public class weapon {
	private int durability;
	private int strength;
	private int level;
	private int damage;

	public weapon() {
		 durability = 100;
		 strength = 1;
		 
	 }	

	public weapon(int lev) {
		level = lev;
		if (level == 1) {
			durability = 10;
		} else if (level == 2) {
			durability = 20;
		}
		
	}
	
	public void durability(int num){
		durability = durability - num;
		if (durability <= 0) {
			durability = 0;
		}
	}
	
	public int useWeapon() {
		if (durability == 0) {
			damage = 0;
			return damage;
		}
		durability = durability - 1;
		Random rand = new Random();
		damage = ((level + strength) * rand.nextInt(10));
		if (durability == 0) {
			level = 0;
			strength = 0;
		}
		return damage;
	}
	
	public int getDurability() {
		return durability;
	}
}
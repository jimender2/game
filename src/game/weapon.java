public class weapon {
	private int durability;
	private int strength;
	private int level;

	public weapon() {
		 durability = 100;
		 strength = 1;
		 
	 }	

	public weapon(int lev, int ag) {
		level = lev;
		if (level == 1) {
			durability = 10;
		} else if (level == 2) {
			durability = 20;
		}
		
		strength = ag;
		if (strength == 0) {
			strength = 1;
		}
		
		durability = 10;
	}
	
	public void damage(int num){
		durability = durability - num;
		if (durability <= 0) {
			durability = 0;
		}
	}
	
	public int getDurability() {
		return durability;
	}
}
package game;

public class monster {
	private int health;
	private int level;
	private int age;
	private int armor;

	public monster() {
		 health = 100;
		 age = 1;
		 
	 }	

	public monster(int lev) {
		level = lev;
		if (level == 1) {
			health = 10;
		} else if (level == 2) {
			health = 20;
		}
		
		armor = 10;
	}
	
	public void damage(int num){
		health = health - num;
		if (health <= 0) {
			health = 0;
		}
	}	
	
	public void heal(int num){
		health = health + num;
	}	
	
	public void changeArmor(int den){
		age = den;
		if (age == 0) {
			age = 1;
		}
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getArmor(){
		return armor;
	}
	
	public int getLevel(){
		return level;
	}
}

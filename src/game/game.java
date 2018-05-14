package game;

public class game {

	public static void main(String[] args) {
		monster monster1 = new monster(1);
		weapon weapon1 = new weapon(1);
		System.out.println(weapon1.getDurability());
		System.out.println(weapon1.useWeapon());
		
		monster1.damage(weapon1.useWeapon());
		
		System.out.println("monster health " + monster1.getHealth());
		
		}	
	}

package game;

public class game {

	public static void main(String[] args) {
		monster monster1 = new monster(1,1);
		monster1.damage(3);
		System.out.println(monster1.getHealth());
	}

}

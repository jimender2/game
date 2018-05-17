package game;

import java.util.Random;

public class map {
	private int map[] = new int [10];	
	Random random = new Random();
	
	public map() {
		int i = 0;
		while (i<=9) {
			map[i] = random.nextInt(1);
			i++;
		}
	}
}
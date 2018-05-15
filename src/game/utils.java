package game;

public class utils {
	public void clearScreen(){
		int i = 0;
		while (i <= 15) {
			System.out.println("");
			i++;
		}
	}
	
	public void displayMap(int map[]) {
		int i = 0;
		int a = 1;
		while (a <= 10) {
			while (i <= 9) {
				System.out.print(map[i]);
				i++;
			}
			System.out.println("");
			a++;
		}
	}
}

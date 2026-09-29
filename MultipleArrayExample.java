package ch03;

public class MultipleArrayExample {

	public static void main(String[] args) {
		String[][] name = {
				{"기본", "크림", "초코"},
				{"크런치", "망고", "생딸기"}
		};
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[i].length; j++) {
				System.out.println("도넛[" + i + "][" + j + "]=" + name[i][j]);
			}
		}

	}

}

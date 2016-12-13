package principal;

public class Stopa {

	public static void main(String[] args) {

		int i = 400;
		
		for (; i < 420; i++) {			
			if (i == 411) {
				System.out.println(i + " IGUAL");
			} else {
				System.out.println(i + " DFERENTE");
			}
		}
		
		for (int j = 0; j < 50; j++) {
			if (j%2 != 0) {
				System.out.println(j);
			}
			
		}

	}

}

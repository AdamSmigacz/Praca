package t_13;

public class SimpleFormat {

	
	public static void main(String[] args) {
		int x = 5;
		double y = 5.55484658;
		System.out.println("Wiersz 1: [" + x + y +  "]");
		System.out.format("Wiersz 1: [%d %f]\n", x, y);   //metoda format i printf sa sobie rowne
		System.out.printf("Wiersz 1: [%d %f]\n", x, y);

	}

}

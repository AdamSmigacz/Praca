package t_13;

import java.util.Formatter;

public class Receipt {

	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printtitle(){
		f.format("%-15s %5s %10s\n", "Towar", "Ilosc", "Cena");  // - oznacza ze wyrownanie jest do lewej. Defaultowo jest do prawej
		f.format("%-15s %5s %10s\n", "-----", "-----", "-----");
	}
	
	public void print(String name, int qty, double price){
		f.format("%-15.15s %5d %10.2f\n", name, qty, price);
		total +=price;
	}
	
	public void printTotal(){
		f.format("%-15s %5s %10.2f\n", "Podatek", "", total*0.22);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "Razem", "", total*1.22);
	}
	public static void main(String[] args) {
		Receipt rp = new Receipt();
		rp.printtitle();
		rp.print("Magiczna fasola", 4, 4.25);
		rp.print("Groch", 3, 6.5);
		rp.print("Real madrid", 1, 14.29);
		rp.printTotal();

	}

}

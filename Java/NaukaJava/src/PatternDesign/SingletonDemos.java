package PatternDesign;

class MenedzerPlikow {
	private static MenedzerPlikow instancja = null;
	private int identyfikator;

	private MenedzerPlikow() {
		identyfikator = (int) ((Math.random() * 10) % 10);
	}

	// -------------------------------------------------------------------------------------------#1
	// sposob
	public static synchronized MenedzerPlikow dawajMenedzer() {
		if (instancja == null) {
			instancja = new MenedzerPlikow();
			return instancja;
		}
		System.out.println("Menedzer juz zostal wczesniej utworzony!");
		return instancja;
	}

	public void about() {
		System.out.println("Identyfiaktor = " + identyfikator);
	}

	/*-------------------------------------------------------------------------------------------#2 sposob
	 // nie inicjujemy tutan nullem, instancja juz od poczatku posiada wartosc
	
	 private final static MenedzerPlikow instancja = new MenedzerPlikow();
	 public static MenedzerPlikow dawajMenedzer(){
	 return instancja;
	 }
	 */

	/*------------------------------------------------------------#3 sposob - metoda podwojnego blokowania
	
	 private static volatile MenedzerPlikow instancja=null;
	 public static MenedzerPlikow dawajMenedzer(){
	 if(instancja == null){
	 synchronized (MenedzerPlikow.class){
	 instancja = new MenedzerPlikow();
	 }
	 }
	 return instancja;
	 }
	 */

}

public class SingletonDemos {

	public static void main(String[] args) {
			MenedzerPlikow[] tab = new MenedzerPlikow[3];
			tab[0] = MenedzerPlikow.dawajMenedzer();
			tab[1] = MenedzerPlikow.dawajMenedzer();
			tab[2] = MenedzerPlikow.dawajMenedzer();
			 
			for(MenedzerPlikow object : tab)
			object.about();
			System.out.println(tab[1].equals(tab[2]) + " " + tab[1].hashCode() + " " + tab[2].hashCode());
	}
}

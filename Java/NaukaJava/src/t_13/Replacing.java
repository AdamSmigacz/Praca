package t_13;

public class Replacing {

	static String splitingknights = Splitting.knights;
	public static void main(String[] args) {
		System.out.println(splitingknights.replaceFirst("z\\w+", "zmienionyString")); // zamienia za pierwsze wystapienie litery 'z' i za nia dowolny ciag znaków 
		System.out.println(splitingknights.replaceAll("category|commitment|period", "zmienionyString")); // kazdy z wymienionych stringów zamienia na "zmienionyString"
	}

}

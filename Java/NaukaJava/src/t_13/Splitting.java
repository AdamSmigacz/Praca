package t_13;

import java.util.Arrays;

public class Splitting {

	public static String knights = "category, service_classification, B2C¯ "
									+ "makes available mobile_broadband "
									+ "term no commitment period";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("e\\W+"); //rozdziela ciag znaków co litere 'e' uzupeniona o litery i cifry

	}
}

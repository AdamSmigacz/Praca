package t_13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {

	
	public static void main(String[] args) {
		
		String input = "To!!Niezwykle zastosowanie!!znakow!!wykrzyknika";
		System.out.println(Arrays.toString(
				Pattern.compile("!!").split(input,3)
				));

	}

}

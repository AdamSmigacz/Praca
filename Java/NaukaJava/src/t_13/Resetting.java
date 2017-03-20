package t_13;

import java.util.regex.*;

public class Resetting {

	public static void main(String[] args) {

		Matcher m = Pattern.compile("[wftzb][aiey][snlr]").matcher("filmu bali sie wszyscy");
		while (m.find()) {
			System.out.println(m.group() + " ");
		}
		System.out.println();
		m.reset("winni stali w szeregu");
		while (m.find()) {
			System.out.println(m.group() + " ");
		}
	}

}

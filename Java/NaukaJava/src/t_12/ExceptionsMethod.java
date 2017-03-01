package t_12;

public class ExceptionsMethod {

	public static void main(String[] args) {

		try {
			throw new Exception("New exception");
		} catch (Exception e) {
			System.out.println("Exception has been catched!");
			System.out.println("getMessage: " + e.getMessage());
			System.out.println("getLocalizedMessage: " + e.getLocalizedMessage());
			System.out.println("toString: " + e);
			System.out.println("printStackTrace: ");
			e.printStackTrace();
		}
	}

}

package t_13;

public class DatabaseException extends Exception{

	public DatabaseException(int transactionID, int queryID, String message){
		super(String.format("(t%d, q%d), %s",transactionID , queryID, message)); //metoda tworzy nowy obiekt string
	}
	
	public static void main(String[] args) {
		
		try {
			throw new DatabaseException(3, 7, "Blad zapisu");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

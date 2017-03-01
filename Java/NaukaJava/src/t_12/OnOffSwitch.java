package t_12;

public class OnOffSwitch {

	private static Switch sw = new Switch();
	public static void f() throws OnOffException, OnOffException2{}
	
	public static void main(String[] args) {
		try {
			sw.on();
			System.out.println(sw);
			f();
			sw.off();
		} catch (OnOffException e) {
			sw.off();
			System.out.println(sw);
		} catch (OnOffException2 e) {
			sw.off();
			System.out.println(sw); // takie rozwiazanie jest niekompletne! je¿eli poleci inny wyjatek to wylacznik pozostanie w stanie on
		} 
		
		try {
			sw.on();
			f();
			sw.off();
			
		} catch (OnOffException e) {
			System.out.println("OnOffException");
			
		} catch(OnOffException2 e){
			System.out.println("OnOffException2");
			
		} finally{
			sw.off(); // takie rozwiazanie powoduje ze ten element zostanie wykonany i wylacznik wpadnie w stan off (porzadane)
		}
		401
	}
}

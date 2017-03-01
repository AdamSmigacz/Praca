package t_12;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("Exception started in f()");
		throw new Exception("Started in f");
	}

	public static void g() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("In g() e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("In h() e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace(); // nowy punkt pochodzenia wyjatku. Przy wywoaniu e.printStackTrace(System.out); system wskaze sciezke stosu do tego miejsca, nie dalje
		}	
	}
	public static void main(String[] args) {
	
		try {
			g();
		} catch (Exception e) {
			System.out.println("Method main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("Method main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}

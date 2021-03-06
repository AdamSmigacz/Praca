package t_8;
//identyfikacja typu w czasie wykonania (RTTI)

class Useful{
	public void f(){
		System.out.println("Useful.f()");
	}
	
	public void g(){
		System.out.println("Useful.g()");
	}
}

class MoreUseful extends Useful{
	public void f(){
		System.out.println("MoreUseful.f()");
	}
	
	public void g(){
		System.out.println("MoreUseful.g()");
	}

public void h(){
	System.out.println("MoreUseful.h()");
}

public void i(){
	System.out.println("MoreUseful.i()");
}

public void j(){
	System.out.println("MoreUseful.j()");
}

}
public class RTTI {


	public static void main(String[] args) {
		Useful[] x = {
				new Useful()
				, new MoreUseful()};
		x[0].f();
		x[1].g();
		
		((MoreUseful)x[1]).i(); //Rtti
		//((MoreUseful)x[0]).f(); //zgoszenie wyjatku
		

		
	}

}

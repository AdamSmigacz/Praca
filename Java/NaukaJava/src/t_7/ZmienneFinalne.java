package t_7;

import java.util.Random;

class Value{
	int i;
	public Value(int i){
		this.i = i;
	}
}
public class ZmienneFinalne {

	private static Random rand = new Random(47);
	private String id;
	public ZmienneFinalne(String id){
		this.id = id;
	}
	private final int valueOne = 9;
	private static final int VALUE_THREE = 99;
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	
	private final int[] a = {1,2,3,4,5,6,7};
	public String toString(){
		return id+ " " + i4+ " " + INT_5;
	}
	public static void main(String[] args) {
		ZmienneFinalne zm = new ZmienneFinalne("Zmienne");
		//zm.valueOne++; zmienna finalna, nie mo¿e byc zmieniana
		zm.v2.i++; // referencja jest stala a nie obiekt, a wiec moze byc zmieniana
		zm.v1 = new Value(9);  //pole nie jest finalne, a wiec referencja moze byc zmieniana
		for (int i = 0; i < zm.a.length; i++){
			
			zm.a[i]++; // obiekt nie jest stala
		System.out.println(zm.a[i]);
		}
		
			//zm.v2 = new Value(22);  referencja jest finalna, nie wolno zmieniac
		System.out.println(zm);
		ZmienneFinalne obiek = new ZmienneFinalne("obiekt");
		System.out.println(obiek);
		

	}

}

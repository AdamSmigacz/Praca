package t_10;


class Wrapping{
	private int i;
	public Wrapping(int x){
		i=x;
	}
	public int value(){
	return i;	
	}
}
			


public class Parcel8 {

	    Wrapping wrapping(int x){
		return new Wrapping(x){
			public int value(){
				return super.value() * 2;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(11);
		System.out.println(w.value());
	}
}

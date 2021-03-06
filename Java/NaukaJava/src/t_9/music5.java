package t_9;


interface InstrumentI{
	int i = 5;
	public void play(int n);
	public void adjust();
}

class WindI implements InstrumentI{
	private int i;
	public void play(int n){
		System.out.println("WindI.play() " + n);
	}
	public String what(){
		return "WindI";
	}

	public void adjust() {
		System.out.println("WindI.adjust()");
		
	}
}

class PercussionI implements InstrumentI{
	private int i;
	public void play(int n){
		System.out.println("PercussionI.play() " + n);
	}
	public String what(){
		return "PercussionI";
	}

	public void adjust() {
		System.out.println("PercussionI.adjust()");
		
	}
}

class StringedI implements InstrumentI{
	private int i;
	public void play(int n){
		System.out.println("StringedI.play() " + n);
	}
	public String what(){
		return "StringedI";
	}

	public void adjust() {
		System.out.println("StringedI.adjust()");
		
	}
}

class BrassI extends WindI{
	public void play(int n){
		System.out.println("BrassI.play() " + n);
	}
	
	public void adjust() {
		System.out.println("BrassI.adjust()");
		
	}
}

class WoodwindI extends WindI{
	public void play(int n){
		System.out.println("WoodwindI.play() " + n);
	}
	
	public void adjust() {
		System.out.println("WoodwindI.adjust()");
		
	}
}


public class music5 {
	static void tuneI(InstrumentI i){
		i.play(15);
	}
	
	static void tuneAllI(InstrumentI[] orchestea){
		for(InstrumentI i : orchestea){
			tuneI(i);
		}
	}
	public static void main(String[] args) {
		InstrumentI[] orchestea = {
				new WindI()
				, new PercussionI()
				, new StringedI()
				, new BrassI()
				, new WoodwindI()
		};
		tuneAllI(orchestea);

	}

}

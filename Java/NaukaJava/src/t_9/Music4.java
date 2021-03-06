package t_9;


abstract class Instrument{
	private int i;
	public abstract void play(int n);
	public String what(){
		return "Instrument";
	}
	
public abstract void adjust();
}

class Wind extends Instrument{
	private int i;
	public void play(int n){
		System.out.println("Wind.play() " + n);
	}
	public String what(){
		return "Wind";
	}

	public void adjust() {
		System.out.println("Wind.adjust()");
		
	}
}

class Percussion extends Instrument{
	private int i;
	public void play(int n){
		System.out.println("Percussion.play() " + n);
	}
	public String what(){
		return "Percussion";
	}

	public void adjust() {
		System.out.println("Percussion.adjust()");
		
	}
}

class Stringed extends Instrument{
	private int i;
	public void play(int n){
		System.out.println("Stringed.play() " + n);
	}
	public String what(){
		return "Stringed";
	}

	public void adjust() {
		System.out.println("Stringed.adjust()");
		
	}
}

class Brass extends Wind{
	public void play(int n){
		System.out.println("Brass.play() " + n);
	}
	
	public void adjust() {
		System.out.println("Brass.adjust()");
		
	}
}

class Woodwind extends Wind{
	public void play(int n){
		System.out.println("Woodwind.play() " + n);
	}
	
	public void adjust() {
		System.out.println("Woodwind.adjust()");
		
	}
}




public class Music4 {
	static void tune(Instrument i){
		i.play(15);
	}
	
	static void tuneAll(Instrument[] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	public static void main(String[] args) {
		
	Instrument[] orchestea = {
			new Wind()
			, new Percussion()
			, new Stringed()
			, new Brass()
			, new Woodwind()
	};
	tuneAll(orchestea);
	}

}

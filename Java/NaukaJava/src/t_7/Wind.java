package t_7;

class Instrument{
	public void play(){
		System.out.println("Instrument play()");}
	
	static void tune (Instrument i){
		i.play();
	}
}

public class Wind extends Instrument{


	public static void main(String[] args) {
		Wind obiekt = new Wind();
		Instrument.tune(obiekt); //rzutowanie w góre

	}

}

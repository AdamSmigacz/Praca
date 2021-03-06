package t_8;

enum NoteM{
	MIDDLE_C, C_SHARP, B_FLAT, FLATFEE;
	
}
class InstrumentM {
	void play(Note n){
		System.out.println("Instrument.play() " + n);
	}
	String what(){
		return "Instrument ";
	}
	void adjust(){
		System.out.println("Strojenie obiektu instrumentu ");
	}
}

class WindM extends InstrumentM{
	void play(Note n){
		System.out.println("WindM.play() " + n);
	}
	String what(){
		return "WindM ";
	}
	void adjust(){
		System.out.println("Strojenie obiektu WindM ");
	}
	
}

class PercusionM extends InstrumentM{
	void play(Note n){
		System.out.println("PercusionM.play() " + n);
	}
	String what(){
		return "PercusionM ";
	}
	void adjust(){
		System.out.println("Strojenie obiektu PercusionM ");
	}
	
}

class StringedM extends InstrumentM{
	void play(Note n){
		System.out.println("StringedM.play() " + n);
	}
	String what(){
		return "StringedM ";
	}
	void adjust(){
		System.out.println("Strojenie obiektu StringedM ");
	}
}
	
	class Brass extends WindM{
		void play(Note n){
			System.out.println("Brass.play() " + n);
		}
		void adjust(){
			System.out.println("Strojenie obiektu Brass ");
		}

}

	class WoodWind extends WindM{
		void play(Note n){
			System.out.println("WoodWind.play() " + n);
		}
		String what(){
			return "WoodWind ";
		}

}
public class Music3{

public static void tune(InstrumentM i){
	i.play(Note.MIDDLE_C);
}
public static void tuneAll(InstrumentM [] e){
	for(InstrumentM i : e){
		tune(i);
	}
	
}
	public static void main(String[] args) {
		
		InstrumentM [] instr = {new WindM()
							, new PercusionM()
							, new StringedM()
							, new Brass()
							, new WoodWind()
		};
		tuneAll(instr);
}
}

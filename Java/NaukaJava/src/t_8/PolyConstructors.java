package t_8;

class Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	
	Glyph(){
		System.out.println("Glyph przed draw()");
		draw();
		System.out.println("Glyph po draw()");
	}
}

class RoundGlyph extends Glyph{
	private int iRadius = 1;
	RoundGlyph(int r){
		iRadius = r;
		System.out.println("RoundGlyph.draw(), radious = " + iRadius);
	}
	void draw(){
		System.out.println("RoundGlyph.draw(), radiouss = " + iRadius);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		
		new RoundGlyph(5);
	}

}

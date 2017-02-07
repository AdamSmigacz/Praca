package t_9;

interface Game{
	boolean move();
}

interface GameFactoryInterface{
	Game getGame();
}

class Checkers implements Game{
private int move = 0;
private static final int MOVES = 3; 
	@Override
	public
		boolean move() {
		System.out.println("Warcaby: ruch ");
		return ++ move != MOVES;
	}
}

class CheckersFactory implements GameFactoryInterface{

	@Override
	public Game getGame() {
		
		return new Checkers();
	}
	
}
class Chees implements Game{
private int move = 0;
private static final int MOVES = 4; 
	@Override
	public
		boolean move() {
		System.out.println("Szachy: ruch ");
		return ++ move != MOVES;
	}
}

class CheesFactory implements GameFactoryInterface{

	@Override
	public Game getGame() {
		
		return new Chees();
	}
	
}

public class GameFactory {

public static void playGame(GameFactoryInterface factory){
	Game s = factory.getGame();
	while(s.move()){
		;
	}
}
	public static void main(String[] args) {
		
		playGame(new CheesFactory());
		playGame(new CheckersFactory());
		
		
	}

}

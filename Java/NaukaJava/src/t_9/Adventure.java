package t_9;

interface CanFight{
	void fight();
}

interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}

class ActionCharacter{
	public void fight(){
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{

	@Override
	public void fly() {
		System.out.println("Hero.fly()");	
	}

	@Override
	public void swim() {
		System.out.println("Hero.swim()");
	}
	
	@Override
	public void fight() {
		System.out.println("Hero.fight()");
	}
}

public class Adventure{
	
	public static void t(CanFight x){
		x.fight();
	}

	public static void u(CanFly x){
		x.fly();
	}
	public static void v(CanSwim x){
		x.swim();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void main(String[] args) {

		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		283
	}
}
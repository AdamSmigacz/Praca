package PatternDesign;


class SingleObject {

	   //create an object of SingleObject
	   private static SingleObject instance;

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
		   if(instance==null){
			   System.out.println("New object created");
			   instance = new SingleObject();}
	        return instance;  
	   }

	   public void showMessage(){
	      System.out.println("Message from singleton!");
	   }
	}

public class Singletondemo {

	public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      SingleObject object1 = SingleObject.getInstance();
	      //show the message
	      object.showMessage();
	      
	   }

}

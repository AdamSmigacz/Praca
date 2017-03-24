package PatternDesign;

public class ThreadSafeSingleton {


    private ThreadSafeSingleton() {}
 
    private static class SingletonHolder {
        private final static ThreadSafeSingleton instance = new ThreadSafeSingleton();
    }
 
    public static ThreadSafeSingleton getInstance() {
        return SingletonHolder.instance;
    }
	public static void main(String[] args) {
		
		

	}

}

package t_10;

// Wszelki kod umieszczony w interfejsie staje sie automatycznie publiczny i statyczny.
public interface ClassInInterface {
	void howdy();

	class Test implements ClassInInterface {

		@Override
		public void howdy() {
			System.out.println("Comarch");
		}

		public static void main(String[] args) {

			new Test().howdy();

		}
	}
}

package t_10;

// Lokalne klasy wewnetrzne nie moga miec zadnych specyfikatorówdustepu, gdyz nie stanowia one czesci klasy zewnetrznej
// dysponuja jednakdostepem do zmiennych finalnych w bloku w którym zostay zdefiniowane oraz do wszystkich skadowych klasy zewnetrznej
interface Counter {
	int next();
}

class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {

		class LocalCounter implements Counter {

			public LocalCounter() {
				System.out.println("LocalCounter");
			}

			@Override
			public int next() {
				System.out.println(name); // dostep do pola finalnego
				return count++;
			}
		}
		return new LocalCounter();
	}

	Counter getCounter2(final String name) {
		return new Counter() {

			{
				System.out.println("Counter");
			}

			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass lc = new LocalInnerClass();
		Counter 
			c1 = lc.getCounter("Lokalny obiekt wewnetrzny"), 
			c2 = lc.getCounter2("Anonimowy obiekt wewnetrzny");

		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(c2.next());
		}
	}
}

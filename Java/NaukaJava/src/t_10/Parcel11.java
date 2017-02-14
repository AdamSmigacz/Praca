package t_10;

public class Parcel11 {

	private static class ParcelContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected static class ParcelDestination implements Destination {

		private String label;

		private ParcelDestination(String who) {
			label = who;
		}

		@Override
		public String readLabel() {
			return label;
		}

		public static void f() {
		}

		static int x = 10;

		static class AnotherLevel {
			public static void f() {
			}

			static int x = 10;
		}
	}

	public static Destination destination(String x){
		return new ParcelDestination(x);
	}
	
	public static Contents contents(){
		return new ParcelContents();
		
	}
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Comarch");
		System.out.println(d.readLabel() + " " + c.value());
		// Dlatego ze klasy wewnetrzne sa statyczne to nie potrzeba tworzenia obiektów klasy Parcel11 (przy zwyklej klasie twoerzenie obiektów parcel11 jest niezbedne)
	}

}

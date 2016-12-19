package t_7;

class oneClass{
	// prywatne metody sa finalne poniewaz nie ma opcji przesloniecia ich
	final int crateMethed(int i){  // nie wolno nadpisywac oraz wydajnosc sie poprawia, metoda jest traktowana inline
		System.out.println("wywoanie metody");
		return i;
	}
}

public class finalMethod  extends oneClass{
/*
	int crateMethed(int i){
		return 22;
	}*/  //nie mozna wywolac takiej metody poniewaz 'final' w metodzie klasy bazowej zabrania nadpisywania tej metody 
	public static void main(String[] args) {
		

	}

}

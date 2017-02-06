package t_9;

import java.util.Random;

// 	kazde pole w interfejsie automatycznie staje sie statyczne i finalne
//	intrerfejsy stanowia idealne narzedzie do grupowania danych
public interface Months {
	int
		JANUARY = 1
		, FEBRUARY =2
		, MARCH = 3
		, APRIL = 4
		, MAY = 5
		, JUNE = 6
		, JULY = 7
		, AUGUST = 8
		, SEPTEMBER = 9
		, OCTOBER = 10
		, NOVEMBER = 11
		, DECEMBER = 12;
}

//DUZE LITERY I PODKRESLENIA DLA NAZW POL STATYCZNYCH I FINALNYCH

// pola nie moga byc pustymi zmiennymi finalnymi ale moga byc inicjalizowane przez wyrazenia nie bedace stalymi

interface RandVals{
	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat();
	double RANDOM_DOUBLE = RAND.nextDouble();
}

//pola przeochowywane sa w obszarze pamieci statycznej  zwiazanej z danym interfejsem
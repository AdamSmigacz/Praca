package t_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

	public static void printQ(Queue queue){
		while(queue.peek() != null){   // zwraca element z przodu kolejki. jezeli lista jest pusta to peek zwraca false (element która jest analogiczna wyrzuca wyjatek)
			System.out.println(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10)); //dodaje element na koniec kolejki
		}
		printQ(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		for (Character c : "Coamrch".toCharArray()) {
			qc.offer(c);
		}
		
		printQ(qc);
	}
}

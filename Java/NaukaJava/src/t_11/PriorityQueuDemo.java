package t_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class PriorityQueuDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue  = new PriorityQueue<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(i+10));
		}
		QueueDemo.printQ(priorityQueue);
		
		List<Integer> ints = Arrays.asList(12,34,55,66,44,22,13,11,24,1,2,3,4,5,6);
		priorityQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		
		String fact = "CHANGE TEXT FIELDS IN CRM";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		System.out.println(stringPQ);
		
		Set<Character> charSet = new TreeSet<Character>();
		for(char c : fact.toCharArray()){
			charSet.add(c);
		}
		PriorityQueue<Character> priorityQueueCH = new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(priorityQueueCH);
	}
	
}

package t_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


class ReversibleArrayList<T> extends ArrayList<T>{
	public ReversibleArrayList(Collection<T> c){
		super(c);
	}
	protected String[] words = "Change text fields in CRM".split(" ");
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				List<String> suffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(suffled, new Random(47));
				return suffled.iterator();
			}
		};	
	}
	
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				
				return new Iterator<T>(){

					int current = size() - 1;
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}
					
					@Override
					public T next() {
						return get(current--);
					}

					@Override
					public void remove(){
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

public class AdapterMethodidom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("Change text fields in CRM".split(" ")));
		for(String s : ral)
			System.out.println(s + " ");
		
		System.out.println();
		for (String s : ral.reversed()) {
			System.out.println(s + " ");
			
		}
	}
}
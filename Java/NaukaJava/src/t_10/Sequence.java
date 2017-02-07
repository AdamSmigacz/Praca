package t_10;
// wzorzec projektowy iterator (ma minimum 3 metody!!! end current next)
interface Selector{
	
	boolean end();
	Object curent();
	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size){
		items = new Object[size];
	}
	
	public void add(Object x){
		if(next < items.length){
			items[next ++ ] = x;
		}
	}
	
	private class SequenceSelector implements Selector{
		
		private int i = 0;
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object curent() {
			
			return items[i];
		}

		@Override
		public void next() {
			if(i< items.length)
				i++;
		}
	}
	public Selector selector(){
		return new SequenceSelector();}
	
	
	public static void main(String[] args) {
		int size = 20;
	Sequence sequence = new Sequence(size);
	for(int i = 0; i < size; i++ ){
		sequence.add(Integer.toString(i));
	}
	
	Selector selector = sequence.selector();
	while(!selector.end()){
		System.out.println(selector.curent() + " ");
		selector.next();
	}
}
}

299

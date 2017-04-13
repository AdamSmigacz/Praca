package t_15;

public class LinkedStack<T> {

	private static class Node<U> {
		U item;
		Node<U> next;

		Node() {

			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {

			this.item = item;
			this.next = next;
		}

		boolean end() {

			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<T>();

	public void push(T item) {
		top = new Node<T>(item, top);
	}
	
	public T pop(){
		T result = top.item;
		if(!top.end()){
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedStack<String> lds =new LinkedStack<String>();
		for(String s : "Set frase on laugh!".split(" "))
		lds.push(s);
		String s;
		while((s = lds.pop()) != null)
			System.out.println(s);
	}
523
}

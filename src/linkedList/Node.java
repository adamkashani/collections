package linkedList;

public class Node<T> {
	
	private T value;
	private Node<T> next; 
	private Node<T> perv;
	
	public Node() {
		super();
	}
	
	public Node(T value) {
		super();
		this.value = value;
	}

	public Node(T value, Node<T> next, Node<T> perv) {
		super();
		this.value = value;
		this.next = next;
		this.perv = perv;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPerv() {
		return perv;
	}

	public void setPerv(Node<T> perv) {
		this.perv = perv;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}

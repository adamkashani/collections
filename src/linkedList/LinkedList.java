package linkedList;

import java.util.NoSuchElementException;

public class LinkedList<T> {

	// the head node of this list
	private Node<T> first;

	// the last node of this list
	private Node<T> last;

	// the number of node on this linked list
	private int size = 0;

	public LinkedList() {
		super();
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

	public int getSize() {
		return size;
	}

	public boolean contains(T object) {

		if (object == null) {
			for (Node<T> x = first; x != null; x = x.getNext()) {
				if (x.getValue() == null) {
					return true;
				}

			}
		} else {
			for (Node<T> x = first; x != null; x = x.getNext()) {
				if (x.getValue().equals(object)) {
					return true;
				}
			}
		}
		return false;
	}

	public void add(T objToAdd) {

		if (this.first == null) {
			first = new Node<>(objToAdd);
//			first.setValue(objToAdd);
			size++;
			return;
		} else if (first.getNext() == null) {
			last = new Node<>(objToAdd);
//			last.setValue(objToAdd);
			last.setPerv(first);
			first.setNext(last);
			size++;
			return;
		} else {
			Node<T> temp = new Node<T>(objToAdd);
			temp.setPerv(last);
			last.setNext(temp);
			last = last.getNext();
			size++;
			return;
		}
	}

	public Node<T> popAndRemove() {
		if (size == 0) {
			// אולי נעשה פה אקספשן אחר או טיפול אחר
			throw new NoSuchElementException("the linked list is empty");
		}
		size--;
		Node<T> temp = first;
		this.first = first.getNext();
		return temp;
	}

	public void remove() {
		if (size == 0) {
			// אולי נעשה פה אקספשן אחר או טיפול אחר
			throw new NoSuchElementException("the linked list is empty");
		}
		size--;
		this.first = first.getNext();
	}

}

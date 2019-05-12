package hashMap;

public class NodeGeneric <K , V> {
	private K key;
	private V value;
	private NodeGeneric<K , V> nextNode;

	public NodeGeneric() {
		super();
	}

	public NodeGeneric(V value, NodeGeneric<K , V> nextNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
	}

	public NodeGeneric(V value) {
		super();
		this.value = value;
	}
	

	public NodeGeneric(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public V getValue() {
		return value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}
	

	public NodeGeneric<K, V> getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeGeneric<K, V> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "NodeGeneric [value=" + value + ", nextNode=" + nextNode + "]";
	}
	
	



}

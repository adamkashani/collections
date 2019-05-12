package hashMap;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class HashMap <K , V> {
	private NodeGeneric<K , V>[]bucket;
	private int size ;
	private int buckets ;  
	private Set<K> keys ;

	public HashMap(int buckets) {
		super();
		validateBuckets(buckets);
		@SuppressWarnings("unchecked")
		NodeGeneric<K , V>[]bucket =  (NodeGeneric<K, V>[]) Array.newInstance(NodeGeneric.class, this.buckets);
		this.keys = new HashSet<>();
		this.bucket = bucket;
	}

	/**
	 * this method add a new key and value to bucket  ,  if the key exists its override the value of this key 
	 * @param key 
	 * @param value
	 * @return return false if not override else true
	 */
	public boolean add (K key , V value) {

		int index = key.hashCode()%buckets;
		//if have bucket with link list
		if(bucket[index]!=null) {
			NodeGeneric<K , V>temp	= bucket[index];
			NodeGeneric<K , V>father = temp;
			while(temp!=null) {
				if(temp.getKey().equals(key)) {
					temp.setValue(value);
					return true;
				}
				father = temp;
				temp=temp.getNextNode();
			}
			//end off the link list 
			father.setNextNode(new NodeGeneric<K , V>(key , value));
			size++;
			return false;
		}else {
			bucket[index] = new NodeGeneric<K , V>(key , value);
			size++;
			return false;
		}
	}

	//return null or root of link list
	public NodeGeneric<K , V> get (K key){
		int index = key.hashCode()%buckets;
		//here we get the root node of link list
		NodeGeneric<K , V>	temp = this.bucket[index];
		while(temp!=null) {
			if(temp.getKey().equals(key)) {
				return temp;
			}else {
				temp=temp.getNextNode();
			}
		}
		return null;
	}

	/**
	 * the method remove node by the key
	 * @param key the key of node to remove
	 * @return true if the key exists and removed else return false
	 */
	public boolean remove (K key) {
		int hash = key.hashCode()%buckets;
		NodeGeneric<K , V>	temp = this.bucket[hash];
		NodeGeneric<K , V> father = temp;
		while(temp!=null) {
			if(temp.getKey().equals(key)) {
				keys.remove(key);
				size--;
				if(temp.getNextNode()!=null) {
					temp.setKey(temp.getNextNode().getKey());
					temp.setValue(temp.getNextNode().getValue());
					temp.setNextNode(temp.getNextNode().getNextNode());
					return true;
				}else if(father.equals(temp)) {
					//remove root of link list
					this.bucket[hash]=null;
				}else {
					//if the remove Node is the last node of this link list
					father.setNextNode(null);
				}
				return true;
			}else {
				father = temp;
				temp=temp.getNextNode();
			}
		}
		return false;
	}

	public int getSize() {
		return this.size;
	}

	public Set<K> getKeys (){
		return this.keys;
	}

	private void validateBuckets(int buckets) {
		if (buckets<=5) {
			// change the buckets to default value off 7
			this.buckets = 7 ;
			return;
		}
		this.buckets = buckets;
	}

}

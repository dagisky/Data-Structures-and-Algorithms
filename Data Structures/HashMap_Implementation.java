/*
 * Author: Dagmawi Moges
 * */

class Node<K, V>{
	private K key;
	private V value;
	private Node next;
	Node(K key, V value){
		/*Constructor for the Node in the hash map
		 * Input: <K> key, <V> value pair
		 * Output: None*/
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public Node getNext() {
		/*Getter for the next attribute*/
		return next;
	}
	public void setNext(Node next) {
		/*Setter for the next attribute*/
		this.next = next;
	}
	public K getKey() {
		/*Getter for the key attribute*/
		return key;
	}
	public void setKey(K key) {
		/*Setter for the key attribute*/
		this.key = key;
	}
	public V getValue() {
		/*Getter for the value attribute*/
		return value;
	}
	public void setValue(V value) {
		/*Setter for the value attribute*/
		this.value = value;
	}	
}

class HashMap<K, V>{
	private int size = 16;
	private Node<K, V>[] data;
	HashMap(){
		this.data = new Node[this.size];
	}
	
	private int hash(K key) {
		/*Creates an index for the given key based on the hash of the key
		 * Input <K>: key
		 * Output (Integer): index between [0-size]*/
		return (key.hashCode() & 0x7fffffff) % this.size;
	}
	
	
	public boolean put(K key, V value) {
		/*Put Key, Value pair to the hashmap
		 * Input <K, V>: key value pare of the given generic data type
		 * Output (boolean): true if successful false else*/
		int index = this.hash(key);
		if(this.data[index] == null) {
			this.data[index] = new Node<K, V>(key, value);
		}else {
			Node<K, V> n = this.data[index];
			while(n.getNext() != null) {
				if(n.getKey() == key) {
					System.out.println("Thiis Key already exists in the hashmap");
					return false;
				}					
				n = n.getNext();
			}
			n.setNext(new Node<K, V>(key, value));
		}
		return true;
	}
	
	public V get(K key) {
		/*Returns Value for the given key, if the pair exist in the hash map
		 * Input <K>: key
		 * Output <V>: value for the given key*/
		int index = this.hash(key);
		V val = null;
		if (this.data[index] == null)
			return val;
		if(this.data[index].getKey() == key)
			return this.data[index].getValue();
		Node <K, V> n = this.data[index];		
		while(n.getNext() != null) {
			if(n.getKey() == key)
				val = (V) n.getValue();
			n = n.getNext();
		}
		return val;
	}
}

public class HashMap_Implementation{	

	public static void main(String[] args) {
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		System.out.println("Starting...");
		System.out.println(mp.put("One", 1));
		System.out.println(mp.put("Two", 2));
		System.out.println(mp.put("Three", 3));
		System.out.println(mp.put("Four", 4));
		System.out.println(mp.get("Two"));
		
	}

}

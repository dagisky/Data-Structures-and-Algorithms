import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

class Node{
	private Object value;
	private Node next;
	Node(){
		this.value = null;
		this.next = null;
	}
	Node(Object obj){
		this.value = obj;
		this.next = null;		
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public boolean hasNext() {
		return this.next != null;
	}
}

class LinkedList{
	private Node node;
	private int size;
	LinkedList(){
		this.node = new Node();
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void add(Object obj) {
		if(this.node.getValue() == null) {
			this.node.setValue(obj);
			this.size++;
		}else {
			Node n = this.node;
			while(n.hasNext()) {
				n = n.getNext();
			}
			n.setNext(new Node(obj));
			this.size++;
		}
	}
	
	public Object get(int index) {
		assert index < this.size: "Error: index out of bound";
		Node n = this.node;
		for(int i = 0; i<index; i++) {
			n = n.getNext();
		}
		return n.getValue();
	}
}


public class Linked_List {	

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("One");
		ll.add(2);
		ll.add("Three");
		System.out.println(ll.get(2));
		
	}

}

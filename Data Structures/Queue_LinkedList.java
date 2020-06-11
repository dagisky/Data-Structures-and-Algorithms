
class Node<T>{
	private T item;
	private Node<T> next; 
	Node(T item){
		this.item = item;
		this.next = null;
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}	
}

class Queue<T>{
	private Node<T> data;
	private int size;
	
	Queue(){
		/*Constructor for the Queue Class*/
		this.size = 0;
		this.data = null;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		/*Checks if the Queue is empty or not
		 * Input (none): 
		 * Output (boolean): true if empty false else*/
		if(this.data.getItem() == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue(T item) {
		/*Add an element at the end(tail) of the queue
		 * Input: <T> an element to be added
		 * Output: None */
		if (this.data != null) {
			Node<T> n = this.data;
			while(n.getNext() != null)
				n = n.getNext();
			n.setNext(new Node<T>(item));
			this.size++;
		}else {
			this.data = new Node<T>(item);
			this.size++;
		}
	}
	
	public T front() {
		/*Returns the elelemt at the front of the queue
		 * Input: (None)
		 * Output: <T> element at the front of the queue*/
		if(this.isEmpty())
			return null;
		T item = this.data.getItem();
		return item;
	}
	
	public T dequeue() {
		/*Returns the elelemt at the front of the queue and removes it
		 * Input: (None)
		 * Output: <T> element at the front of the queue*/
		if(this.isEmpty())
			return null;
		T item = this.data.getItem();
		this.data = this.data.getNext();
		this.size--;
		return item;
	}
	
}
public class Queue_LinkedList{	

	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("One");
		q.enqueue("Two");
		q.enqueue("Three");
		q.enqueue("Four");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}

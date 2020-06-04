/* Linked List Implementation Of Stack
 * Author: Dagmawi Moges
 * PhD: Computer Science
 * */

class Node<T>{
	private T data;
	private Node next;
	Node(T data){
		/*Constructor of the Node Class*/
		this.data = data;
		this.next = null;
	}
	Node(){/*Do Nothing*/}	
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public T getData() {
		/*Input: None
		 * Output: <T> getter of the item value*/
		return data;
	}
	public void setData(T data) {
		/*Input: <T>
		 * Output: None: Setter of the item value*/
		this.data = data;
	}
	
}

class Stack<T>{
	private Node top;
	private int length;
	Stack(){
		this.top = null;
		this.length = 0;
	}	
	public int length() {
		/*The length of available elements in the stack
		 * Input: None
		 * Output: (int)*/
		return this.length;
	}
	public void push(T item) {
		/*Add an element to the stack
		 * Input:<T>
		 * Output: None
		 * */
		Node node = new Node(item);
		node.setNext(this.top);
		this.top = node;
		this.length++;
	}
	
	public T pop() {
		/*Removes one element from the top of the stack
		 *Input: None
		 *Output: <T> */
		T res = (T) this.top.getData();
		this.top = this.top.getNext();
		this.length--;
		return res;
	}
	public T peek() {
		/*Returns the value of the top stack: note the length of the stack will not chnage in this case
		 * Input: None
		 * Output: <T> */
		return (T) this.top.getData();
	}
	
}



public class Stack_LinkedList{	

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("One");
		stk.push("Two");
		stk.push("Three");
		System.out.println(stk.length());
		System.out.println(stk.pop());
		System.out.println(stk.length());
		
	}

}

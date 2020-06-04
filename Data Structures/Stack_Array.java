/*
 * Simple implementation of stack using arrays
 * Author: Dagmawi Moges
 * */

class Stack<T>{
	/*
	 * This is List implementatio of Stack
	 * */
	private int top;
	private Object[] list;
	Stack(){
		this.top = -1;
		this.list = new Object[10];
	}
	private int size() {
		/*
		 * Input: None
		 * Output: (int) total length of the stack*/
		return this.list.length;		
	}
	
	public int length() {
		/*
		 * Input: None
		 * Output: (int) curtent length of the stack*/
		return this.top+1;		
	}
	
	public T pop() {
		/*
		 * Input: None
		 * Output: <T> returns single element from the top of the stack
		 * if the stack is empty returns null, Note this reduces the length of the stack
		 * */
		if(this.top != -1) {
			T ele = (T)this.list[this.top];
			this.top--;
			return (T)ele;
		}else {
			return null;
		}
	}
	public T peek() {
		/*
		 * Input: None
		 * Output: <T> returns single element from the top of the stack
		 * returns null of the stack is empty
		 * Note this dose not reduce the length of the stack
		 * */
		if(this.top != -1) {
			T ele = (T)this.list[this.top];
			return (T)ele;
		}else {
			return null;
		}
	}
	private void expand() {
		/*
		 * Input: None
		 * Output: None
		 * expands the size of the stack twice fold, if the stack is full
		 * */
		Object[] list = new Object[this.size()*2];
		for(int i = 0; i < this.top; i++) {
			list[i] = this.list[i];
		}
		this.list = list;
	}
	public void push(T e) {
		/*
		 * Input: generic type <T>
		 * Output: None 
		 * Add single element to the stack
		 * */
		if (this.top == this.size()-1)
			this.expand();		
		this.list[this.top+1] = e; 
		this.top++;
	}
	
}



public class Stack_Array{	

	public static void main(String[] args) {
		Stack<String> foo	= new Stack<String>();
		foo.push("Dagmawi");
		foo.push("Kalkidan");
		foo.push("Wongelawit");
		
		System.out.println(foo.pop());
		System.out.println(foo.pop());
		System.out.println(foo.length());
		
	}

}

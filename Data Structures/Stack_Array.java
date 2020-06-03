

class Stack<T>{
	private int top;
	private Object[] list;
	Stack(){
		this.top = -1;
		this.list = new Object[10];
	}
	private int size() {
		return this.list.length;		
	}
	
	public int length() {
		return this.top+1;		
	}
	
	public T pop() {
		if(this.top != -1) {
			T ele = (T)this.list[this.top];
			this.top--;
			return (T)ele;
		}else {
			return null;
		}
	}
	public T peek() {
		if(this.top != -1) {
			T ele = (T)this.list[this.top];
			return (T)ele;
		}else {
			return null;
		}
	}
	private void expand() {
		Object[] list = new Object[this.size()*2];
		for(int i = 0; i < this.top; i++) {
			list[i] = this.list[i];
		}
		this.list = list;
	}
	public void push(T e) {
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

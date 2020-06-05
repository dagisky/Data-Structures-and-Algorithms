import java.util.Objects;


class Queue<T>{
	/*The queue class has four functions all of the functions should run
	 *In constant time complexity
	 */
	private Object[] data;
	int head;
	int tail;
	Queue(){
		/*Constructor for the Queue Class*/
		this.data = new Object[10];
		this.head = -1;
		this.tail = -1;
	}
	public boolean isEmpty() {
		/*Checks if the Queue is empty or not
		 * Input (none): 
		 * Output (boolean): true if empty false else*/
		if(this.head == -1 && this.tail == -1) {
			return true;
		}else {
			return false;
		}
	}
	private void expand() throws ClassCastException{
		/*Expands the current array for the queue if it is full
		 * The function doubles if the queue is full and at least half of the 
		 * queue was not dequeued.
		 * Input: None
		 * Output: None */
		if(this.head > (int) this.data.length/2) {
			int len = this.tail - this.head;
			for(int i = this.head, k = 0; i < this.tail; i++,k++) {
				this.data[k] = this.data[i];
			}
		}else {
			Object newData[] = new Objects[this.data.length*2];
			for(int i = this.head, k=0; i<this.tail; i++,k++) {
				newData[k] = this.data[i];
			}
			this.tail = this.tail - this.head;
			this.head = 0;		
			this.data = newData;
		}
	}
	public void enqueue(T ele) {
		/*Add an element at the end(tail) of the queue
		 * Input: <T> an element to be added
		 * Output: None */
		if(this.tail >= this.data.length)
			this.expand();
		this.data[this.tail+1] =  ele;
		if(this.head == -1)
			this.head++;
		this.tail++;		
	}
	public T front(){
		/*Returns the elelemt at the front of the queue
		 * Input: (None)
		 * Output: <T> element at the front of the queue*/
		if(!this.isEmpty()) {
			return (T) this.data[this.head];
		}
		return null;
	}
	public T dequeue() {
		/*Returns the elelemt at the front of the queue and removes it
		 * Input: (None)
		 * Output: <T> element at the front of the queue*/
		if(!this.isEmpty()) {
			T ele = (T) this.data[this.head];
			this.head++;
			return ele;
		}
		return null;
	}
}

public class Queue_Array{	

	public static void main(String[] args) {
		
		Queue<String> q = new Queue<String>();
		q.enqueue("One");
		q.enqueue("Two");
		q.enqueue("Three");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}

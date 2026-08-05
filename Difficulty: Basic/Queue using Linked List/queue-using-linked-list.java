// Node class
class Node {
	int data;
	Node next;
	
	Node(int val) {
		data = val;
		next = null;
	}
}

// Queue class
class myQueue {
	
	private Node head;
	private int size;
	
	public myQueue() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}
	
	public void enqueue(int x) {
		Node newNode = new Node(x);
		
		if (head == null) {
			head = newNode;
		}
		else {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = newNode;
		}
		size++;
		// Adds an element x at the rear of the queue.
	}
	
	public void dequeue() {
		if (head == null)
			return;
		
		head = head.next;
		size--;
		// Removes the front element of the queue
	}
	
	public int getFront() {
		if (head == null)
			return - 1;
		
		return head.data;
		// Returns the front element of the queue.
		// If queue is empty, return -1.
	}
	
	public int size() {
		return size;
		// Returns the current size of the queue.
	}
}

class myStack {
	
	private Node head;
	private int size;
	
	public myStack() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(int x) {
		Node tmp = new Node(x);
		tmp.next = head;
		head = tmp;
		size++;
	}
	
	public void pop() {
		if (isEmpty())
			return;
		
		head = head.next;
		size--;
	}
	
	public int peek() {
		if (isEmpty())
			return - 1;
		
		return head.data;
	}
	
	public int size() {
		return size;
	}
}

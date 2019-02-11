package lecture03_oop_iii.book_examples;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 16;

	/** Construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		this(StackOfIntegers.DEFAULT_CAPACITY);
	}

	/** Construct a stack with the specified maximum capacity */
	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}

	/** Push a new integer into the top of the stack */
	public void push(int value) {
		if (this.size >= this.elements.length) {
			int[] temp = new int[this.elements.length * 2];
			System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
			this.elements = temp;
		}

		this.elements[this.size++] = value;
	}

	/** Return and remove the top element from the stack */
	public int pop() {
		return this.elements[--this.size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return this.elements[this.size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return this.size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return this.size;
	}
}

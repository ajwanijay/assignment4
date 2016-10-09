
class Stack {
	
/*	Design a java class that encapsulate the data structure Stack (Last in First out).
   The class has 2 methods:
  (push): method for adding items to stack, the push operation adds items to the top of the list
		(pop): method for retrieving items from the stack. The pop operation removes an item 
		from the top of the list, and returns its value to the caller.
		In the case of overflow the user should be informed with a message
		In the case of underflow, the user should be informed with a message & a value of 
		zero is returned. */

	private int stk[];
	private int tos;
	int i;

	
	Stack(int size) {
		stk = new int[size];
		tos = -1;
	}

	void push(int item) {
		if (tos == stk.length - 1) 
			System.out.println("Stack is full.");
		else
			stk[++tos] = item;
	}

	
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stk[tos--];
	}
}

public class TestStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack = new Stack(10);
		
		
		for (int i = 0; i < 10; i++)
			mystack.push(i);
		
		System.out.println("Stack in mystack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack.pop());
		}
}
public class Stack<T extends Object> {
	private int max;
    private T[] stackArray;
    private int top;

    public Stack (int size){
        this.max = size;
        this.stackArray = (T[]) new Object[max];
        top = -1;
    }

    public void push (T item){
        this.stackArray[++top] = item;
    }
    
    public T peek() {
    	return stackArray[top];
    }

    public T pop(){
        return this.stackArray[top--];
    }

    public boolean isEmpty(){
        return(top == -1);
    }
}

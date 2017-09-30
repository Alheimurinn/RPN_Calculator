public class Stack<T extends Object> {
	private int max;
    private T[] stackArray;
    private int number = 0;
    private int top;

    public Stack (int size){
        this.max = size;
        this.stackArray = (T[]) new Object[max];
        top = -1;
    }

    public void push (T item){
        this.stackArray[++top] = item;
        number++;
    }
    
    public T peek() {
    	return this.stackArray[top];
    }

    public T pop(){
    	number--;
        return this.stackArray[top--];
    }

    public boolean isEmpty(){
        return(top == -1);
    }
    
    public int size() {
    	return number;
    }
}

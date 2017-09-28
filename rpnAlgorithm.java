public class rpnAlgorithm {
	private Stack<Integer> stack;
	private String input;
	private int result;
	private int op1;
	private int op2;

	public rpnAlgorithm(String str) {
		this.input = str;
		int size = input.length();
		this.stack = new Stack<Integer>(size);
	}

	//check if the string is an int
	public static boolean isInt(String str) {
		if(str == null) {
			return false;
		}
		int len = str.length();
		if(len == 0) {
			return false;
		}
		int i = 0;
		if(str.charAt(0) == '-') {
			if(len == 1) {
				return false;
			}
			i = 1;
		}
		for(; i < len; i++) {
			char c = str.charAt(i);
			if(c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
	
	//Determine which operator should be used
	public void checkOperator(String str){
		int tempResult;
		switch(str){
		case "+": 
			op1 = stack.pop();
			op2 = stack.pop();
			tempResult = op1 + op2;
			stack.push(tempResult);
			break;
		case "-": 
			op1 = stack.pop();
			op2 = stack.pop();
			tempResult = op1 - op2;
			stack.push(tempResult);
			break;
		case "*": 
			op1 = stack.pop();
			op2 = stack.pop();
			tempResult = op1 * op2;
			stack.push(tempResult);
			break;
		case "/": 
			op1 = stack.pop();
			op2 = stack.pop();
			tempResult = op1 / op2;
			stack.push(tempResult);
			break;
		case "^": 
			op1 = stack.pop();
			op2 = stack.pop();
			tempResult = op1 ^ op2;
			stack.push(tempResult);
			break;
		}
	}
	
	public int getResult(){
		
		//add each char in string into a char array
		char[] charAry = input.toCharArray();
		
		//convert char back to string
		for(int i=0; i < charAry.length; i++){
			String temp = Character.toString(charAry[i]);
			
			//check if current string is an integer, if so, add into the stack
			if(isInt(temp)){
				int addInt = Integer.parseInt(temp);
				stack.push(addInt);
			}else{
				//compute previous 2 operands with operator
				//push the result back into stack
				checkOperator(temp);
			}
		}
		result = stack.pop();
		return result;
	}
}

public class rpnAlgorithm {
	private Stack<Integer> stack;
	private String input;
//	private int result;

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
	
	public void isOperator(){
		
	}
	
	public int getResult(){
		return 0;
	}
}

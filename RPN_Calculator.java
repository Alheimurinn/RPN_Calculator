import java.util.Scanner;

public class RPN_Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//LinkedList<String> formula = new LinkedList<String>();
		String inputStr;
		String rpnForm;
		int answer;
		
		System.out.println("Please enter your equation: ");

        inputStr = input.nextLine();
        
        input.close();
        
        inToPost convert = new inToPost(inputStr);
        
        rpnForm = convert.tranEquation();
        
        rpnAlgorithm compute = new rpnAlgorithm(rpnForm);
        
        answer = compute.getResult();

        
 /*       //convert input string to char[]
        char[] charArray = inputStr.toCharArray();
        
        //convert each char back to string, and store in string linkedlist
        for(int i=0; i < charArray.length; i++) {
        	String temp = Character.toString(charArray[i]);
        	formula.add(temp);
        }     
*/
        
        System.out.println("The RPN form of your equation is: " + rpnForm + "\n");
        //System.out.println("The result of your equation is: " + answer);

	}
}

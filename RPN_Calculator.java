import java.util.Scanner;

public class RPN_Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String inputStr;
		String rpnForm;
		double answer;

		while(true) {
			System.out.println("Please enter your equation OR press q to quit: ");
			inputStr = input.nextLine();
			
			if(inputStr.equals("q")) {
				System.out.println("Program has successfully terminated!");
				input.close();
				break;
			}else {
				
				inToPost convert = new inToPost(inputStr);
				rpnForm = convert.tranEquation();
				rpnAlgorithm compute = new rpnAlgorithm(rpnForm);
				answer = compute.getResult();

				System.out.println("The RPN form of your equation is: " + rpnForm);
				System.out.println("The result of your equation is: " + answer);
				System.out.println();
			}

		}
	}
}

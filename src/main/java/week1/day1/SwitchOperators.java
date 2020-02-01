package week1.day1;

public class SwitchOperators {

	public static void main(String[] args) {
		char operator='*';
		int a=10,b=5;
		switch (operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.err.println("Not a valid Arithmetic Operator!!!");
			break;
		}

	}

}

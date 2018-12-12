

public class DriverPostfixEvaluation {
	public static void main(String[] args) {
		
		String exp= "1 2 3 * + 4 -";	
		System.out.print("The postfix evaluation of the expression "+exp +" is: ");
		int value=PostFixEvaluator.PostfixEvaluation(exp);
		System.out.println(value+"\n");
		String exp1= "2 3 * 15 5 / + 10 -";		
		System.out.print("The postfix evaluation of the expression "+exp1 +" is: ");
		int value1=PostFixEvaluator.PostfixEvaluation(exp1);
		System.out.println(value1+"\n");
		String exp2= "10 2 * 8 4 / + ";		
		System.out.print("The postfix evaluation of the expression "+exp2 +" is: ");

		int value2=PostFixEvaluator.PostfixEvaluation(exp2);
		System.out.println(value2+"\n");
		
		
		 
	}
}

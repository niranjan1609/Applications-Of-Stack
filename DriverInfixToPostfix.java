
public class DriverInfixToPostfix {
	public static void main(String[] args) {
	String exp = "A+B-C"; 
	System.out.print("The conversion of the infix string "+exp +" to postfix: ");
    System.out.println(InfixTopostfix.infixToPostfix(exp)+"\n");
    
    String b = "(A+B)/(C-D)"; 
	System.out.print("The conversion of the infix string "+b +" to postfix: ");
    System.out.println(InfixTopostfix.infixToPostfix(b)+"\n"); 
    
    String exp1 = "a+b*(c^d-e)^(f+g*h)-i"; 
	System.out.print("The conversion of the infix string "+exp1 +" to postfix: ");
    System.out.println(InfixTopostfix.infixToPostfix(exp1)+"\n"); 
    
    String a = "A*B+C"; 
	System.out.print("The conversion of the infix string "+a +" to postfix: ");
    System.out.println(InfixTopostfix.infixToPostfix(a)+"\n"); 
    
    String c = "((A+B)*(C-D)+E)/(F+G)"; 
	System.out.print("The conversion of the infix string "+c +" to postfix: ");
    System.out.println(InfixTopostfix.infixToPostfix(c)+"\n"); 
	}
} 

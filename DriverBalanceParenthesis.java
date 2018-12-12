
public class DriverBalanceParenthesis {
	public static void main(String[] args) throws Throwable{
		MyGenericsStack<Character> stack =new MyGenericsStack<Character>();
		char exp[] = {'{','(',')','}','[',']'}; 
		stack.Arrayprint(exp);
        if (stack.BalanceParanthesis(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");  
        System.out.println("\n####################\n");
        char e[] = { '{', '(' ,')', '{' ,'[' ,'(' ,')' ,']' ,'}' ,'}'}; 
		stack.Arrayprint(e);
        if (stack.BalanceParanthesis(e)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");  
        System.out.println("\n####################\n");
        char a[] = {'[', '(' ,']' ,')'}; 
		stack.Arrayprint(a);
        if (stack.BalanceParanthesis(a)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");  
        System.out.println("\n####################\n");
        char b[] = {')' ,'('}; 
       	stack.Arrayprint(b);
        if (stack.BalanceParanthesis(b)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");
        System.out.println("\n####################\n");
        char c[] = { '{', '(', ')' ,'(' ,')' ,'(' ,')' ,'[' ,'{' ,'}' ,']','}'}; 
		stack.Arrayprint(c);
        if (stack.BalanceParanthesis(c)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");  
        System.out.println("\n####################\n");
        
        
	}
	
}
 